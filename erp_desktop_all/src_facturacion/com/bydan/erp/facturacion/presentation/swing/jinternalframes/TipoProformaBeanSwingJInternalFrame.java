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

import com.bydan.erp.facturacion.util.TipoProformaConstantesFunciones;
import com.bydan.erp.facturacion.util.TipoProformaParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.TipoProformaParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.TipoProformaBean;
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
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoProformaBeanSwingJInternalFrame extends TipoProformaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoProformaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoProforma> tipoproformaValidator = new ClassValidator<TipoProforma>(TipoProforma.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoProforma tipoproforma;	
	public TipoProforma tipoproformaAux;
	public TipoProforma tipoproformaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoProforma tipoproformaTotales;
	public Long idTipoProformaActual;
	public Long iIdNuevoTipoProforma=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosProforma=false;

	public Boolean getIsTienePermisosProforma() {
		return isTienePermisosProforma;
	}

	public void setIsTienePermisosProforma(Boolean isTienePermisosProforma) {
		this.isTienePermisosProforma= isTienePermisosProforma;
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
	
	public Boolean isPermisoTodoTipoProforma;
	public Boolean isPermisoNuevoTipoProforma;
	public Boolean isPermisoActualizarTipoProforma;
	public Boolean isPermisoActualizarOriginalTipoProforma;
	public Boolean isPermisoEliminarTipoProforma;
	public Boolean isPermisoGuardarCambiosTipoProforma;
	public Boolean isPermisoConsultaTipoProforma;
	public Boolean isPermisoBusquedaTipoProforma;
	public Boolean isPermisoReporteTipoProforma;
	public Boolean isPermisoPaginacionMedioTipoProforma;
	public Boolean isPermisoPaginacionAltoTipoProforma;
	public Boolean isPermisoPaginacionTodoTipoProforma;
	public Boolean isPermisoCopiarTipoProforma;
	public Boolean isPermisoVerFormTipoProforma;
	public Boolean isPermisoDuplicarTipoProforma;
	public Boolean isPermisoOrdenTipoProforma;
	
	
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
	
	public TipoProformaParameterReturnGeneral tipoproformaReturnGeneral;
	public TipoProformaParameterReturnGeneral tipoproformaParameterGeneral;
	
	

	public ProformaLogic proformaLogic=null;

	public ProformaLogic getProformaLogic() {
		return proformaLogic;
	}

	public void setProformaLogic(ProformaLogic proformaLogic) {
		this.proformaLogic = proformaLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoProforma=false;
	public Boolean esParaAccionDesdeFormularioTipoProforma=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoProformaSessionBeanAdditional tipoproformaSessionBeanAdditional=null;
	
	public TipoProformaSessionBeanAdditional getTipoProformaSessionBeanAdditional() {
		return this.tipoproformaSessionBeanAdditional;
	}
	
	public void setTipoProformaSessionBeanAdditional(TipoProformaSessionBeanAdditional tipoproformaSessionBeanAdditional) {
		try {
			this.tipoproformaSessionBeanAdditional=tipoproformaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoProformaBeanSwingJInternalFrameAdditional tipoproformaBeanSwingJInternalFrameAdditional=null;
	//public class TipoProformaBeanSwingJInternalFrame
	
	public TipoProformaBeanSwingJInternalFrameAdditional getTipoProformaBeanSwingJInternalFrameAdditional() {
		return this.tipoproformaBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoProformaBeanSwingJInternalFrameAdditional(TipoProformaBeanSwingJInternalFrameAdditional tipoproformaBeanSwingJInternalFrameAdditional) {
		try {
			this.tipoproformaBeanSwingJInternalFrameAdditional=tipoproformaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoProformaLogic tipoproformaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoProforma tipoproformaBean;
	public TipoProformaConstantesFunciones tipoproformaConstantesFunciones;
	//public TipoProformaParameterReturnGeneral tipoproformaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoProforma> tipoproformas;	
	//public List<TipoProforma> tipoproformasEliminados;
	//public List<TipoProforma> tipoproformasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoProforma=false;
	public Boolean isVisibilidadCeldaDuplicarTipoProforma=true;
	public Boolean isVisibilidadCeldaCopiarTipoProforma=true;
	public Boolean isVisibilidadCeldaVerFormTipoProforma=true;
	public Boolean isVisibilidadCeldaOrdenTipoProforma=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoProforma=false;
	public Boolean isVisibilidadCeldaModificarTipoProforma=false;
	public Boolean isVisibilidadCeldaActualizarTipoProforma=false;
	public Boolean isVisibilidadCeldaEliminarTipoProforma=false;
	public Boolean isVisibilidadCeldaCancelarTipoProforma=false;
	public Boolean isVisibilidadCeldaGuardarTipoProforma=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoProforma=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoProforma() {
		return this.iIdNuevoTipoProforma;
	}

	public void setiIdNuevoTipoProforma(Long iIdNuevoTipoProforma) {
		this.iIdNuevoTipoProforma = iIdNuevoTipoProforma;
	}
	
	public Long getidTipoProformaActual() {
		return this.idTipoProformaActual;
	}

	public void setidTipoProformaActual(Long idTipoProformaActual) {
		this.idTipoProformaActual = idTipoProformaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoProforma gettipoproforma() {
		return this.tipoproforma;
	}

	public void settipoproforma(TipoProforma tipoproforma) {
		this.tipoproforma = tipoproforma;
	}
	
	public TipoProforma gettipoproformaAux() {
		return this.tipoproformaAux;
	}

	public void settipoproformaAux(TipoProforma tipoproformaAux) {
		this.tipoproformaAux = tipoproformaAux;
	}				
	
	public TipoProforma gettipoproformaAnterior() {
		return this.tipoproformaAnterior;
	}

	public void settipoproformaAnterior(TipoProforma tipoproformaAnterior) {
		this.tipoproformaAnterior = tipoproformaAnterior;
	}	
	
	public TipoProforma gettipoproformaTotales() {
		return this.tipoproformaTotales;
	}

	public void settipoproformaTotales(TipoProforma tipoproformaTotales) {
		this.tipoproformaTotales = tipoproformaTotales;
	}	
	
	public TipoProforma gettipoproformaBean() {
		return this.tipoproformaBean;
	}

	public void settipoproformaBean(TipoProforma tipoproformaBean) {
		this.tipoproformaBean = tipoproformaBean;
	}	
	
	public TipoProformaParameterReturnGeneral gettipoproformaReturnGeneral() {
		return this.tipoproformaReturnGeneral;
	}

	public void settipoproformaReturnGeneral(TipoProformaParameterReturnGeneral tipoproformaReturnGeneral) {
		this.tipoproformaReturnGeneral = tipoproformaReturnGeneral;
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
	
	
	public TipoProformaLogic getTipoProformaLogic()	{		
		return tipoproformaLogic;
	}

	public void setTipoProformaLogic(TipoProformaLogic tipoproformaLogic) {
		this.tipoproformaLogic = tipoproformaLogic;
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
	
	public Boolean getIsEsNuevoTipoProforma() {
		return isEsNuevoTipoProforma;
	}

	public void setIsEsNuevoTipoProforma(Boolean isEsNuevoTipoProforma) {
		this.isEsNuevoTipoProforma = isEsNuevoTipoProforma;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoProforma() {
		return esParaAccionDesdeFormularioTipoProforma;
	}
	
	public void setEsParaAccionDesdeFormularioTipoProforma(Boolean esParaAccionDesdeFormularioTipoProforma) {
		this.esParaAccionDesdeFormularioTipoProforma = esParaAccionDesdeFormularioTipoProforma;
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

			if(this.tipoproformaSessionBean==null) {
				this.tipoproformaSessionBean=new TipoProformaSessionBean();
			}

			if(!this.tipoproformaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipoproformaSessionBean.getlidEmpresaActual());
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

					if(this.tipoproforma!=null) {
						this.tipoproforma.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoProforma!=null) {
						this.jInternalFrameDetalleFormTipoProforma.jComboBoxid_empresaTipoProforma.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoProforma.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoProforma!=null) {
						if(this.jInternalFrameDetalleFormTipoProforma.jComboBoxid_empresaTipoProforma.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoProforma.jComboBoxid_empresaTipoProforma.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoProformaGenerico)throws Exception
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
				jComboBoxid_empresaTipoProformaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoProformaGenerico!=null && jComboBoxid_empresaTipoProformaGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoProformaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoProforma tipoproforma,JComboBox jComboBoxid_empresaTipoProformaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoProformaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoProforma.jComboBoxid_empresaTipoProforma.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoProformaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipoproforma.setid_empresa(empresaAux.getId());
				tipoproforma.setempresa_descripcion(TipoProformaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipoproforma.setEmpresa(empresaAux);			}
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

					if(!TipoProformaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoProforma!=null) { 
							this.jInternalFrameDetalleFormTipoProforma.jComboBoxid_empresaTipoProforma.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoProforma.jComboBoxid_empresaTipoProforma.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoProforma!=null) { 
					}

					if(!TipoProformaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoProforma!=null) {
							this.jInternalFrameDetalleFormTipoProforma.jComboBoxid_empresaTipoProforma.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoProforma!=null) {
							this.jInternalFrameDetalleFormTipoProforma.jComboBoxid_empresaTipoProforma.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoProforma() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoProformaConstantesFunciones.refrescarForeignKeysDescripcionesTipoProforma(this.tipoproformaLogic.getTipoProformas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoProformaConstantesFunciones.refrescarForeignKeysDescripcionesTipoProforma(this.tipoproformas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoproformaLogic.setTipoProformas(this.tipoproformas);
			tipoproformaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoProformaParameterReturnGeneral getTipoProformaParameterGeneral() {
		return this.tipoproformaParameterGeneral;
	}
	
	public void setTipoProformaParameterGeneral(TipoProformaParameterReturnGeneral tipoproformaParameterGeneral) {
		this.tipoproformaParameterGeneral = tipoproformaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoProforma() {
		return isPermisoTodoTipoProforma;
	}

	public void setIsPermisoTodoTipoProforma(Boolean isPermisoTodoTipoProforma) {
		this.isPermisoTodoTipoProforma = isPermisoTodoTipoProforma;
	}

	public Boolean getIsPermisoNuevoTipoProforma() {
		return isPermisoNuevoTipoProforma;
	}

	public void setIsPermisoNuevoTipoProforma(Boolean isPermisoNuevoTipoProforma) {
		this.isPermisoNuevoTipoProforma = isPermisoNuevoTipoProforma;
	}

	public Boolean getIsPermisoActualizarTipoProforma() {
		return isPermisoActualizarTipoProforma;
	}

	public void setIsPermisoActualizarTipoProforma(Boolean isPermisoActualizarTipoProforma) {
		this.isPermisoActualizarTipoProforma = isPermisoActualizarTipoProforma;
	}

	public Boolean getIsPermisoEliminarTipoProforma() {
		return isPermisoEliminarTipoProforma;
	}

	public void setIsPermisoEliminarTipoProforma(Boolean isPermisoEliminarTipoProforma) {
		this.isPermisoEliminarTipoProforma = isPermisoEliminarTipoProforma;
	}

	public Boolean getIsPermisoGuardarCambiosTipoProforma() {
		return isPermisoGuardarCambiosTipoProforma;
	}

	public void setIsPermisoGuardarCambiosTipoProforma(Boolean isPermisoGuardarCambiosTipoProforma) {
		this.isPermisoGuardarCambiosTipoProforma = isPermisoGuardarCambiosTipoProforma;
	}
	
	public Boolean getIsPermisoConsultaTipoProforma() {
		return isPermisoConsultaTipoProforma;
	}

	public void setIsPermisoConsultaTipoProforma(Boolean isPermisoConsultaTipoProforma) {
		this.isPermisoConsultaTipoProforma = isPermisoConsultaTipoProforma;
	}

	public Boolean getIsPermisoBusquedaTipoProforma() {
		return isPermisoBusquedaTipoProforma;
	}

	public void setIsPermisoBusquedaTipoProforma(Boolean isPermisoBusquedaTipoProforma) {
		this.isPermisoBusquedaTipoProforma = isPermisoBusquedaTipoProforma;
	}

	public Boolean getIsPermisoReporteTipoProforma() {
		return isPermisoReporteTipoProforma;
	}

	public void setIsPermisoReporteTipoProforma(Boolean isPermisoReporteTipoProforma) {
		this.isPermisoReporteTipoProforma = isPermisoReporteTipoProforma;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoProforma() {
		return isPermisoPaginacionMedioTipoProforma;
	}

	public void setIsPermisoPaginacionMedioTipoProforma(Boolean isPermisoPaginacionMedioTipoProforma) {
		this.isPermisoPaginacionMedioTipoProforma = isPermisoPaginacionMedioTipoProforma;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoProforma() {
		return isPermisoPaginacionTodoTipoProforma;
	}

	public void setIsPermisoPaginacionTodoTipoProforma(Boolean isPermisoPaginacionTodoTipoProforma) {
		this.isPermisoPaginacionTodoTipoProforma = isPermisoPaginacionTodoTipoProforma;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoProforma() {
		return isPermisoPaginacionAltoTipoProforma;
	}

	public void setIsPermisoPaginacionAltoTipoProforma(Boolean isPermisoPaginacionAltoTipoProforma) {
		this.isPermisoPaginacionAltoTipoProforma = isPermisoPaginacionAltoTipoProforma;
	}
	
	public Boolean getIsPermisoCopiarTipoProforma() {
		return isPermisoCopiarTipoProforma;
	}

	public void setIsPermisoCopiarTipoProforma(Boolean isPermisoCopiarTipoProforma) {
		this.isPermisoCopiarTipoProforma = isPermisoCopiarTipoProforma;
	}
	
	public Boolean getIsPermisoVerFormTipoProforma() {
		return isPermisoVerFormTipoProforma;
	}

	public void setIsPermisoVerFormTipoProforma(Boolean isPermisoVerFormTipoProforma) {
		this.isPermisoVerFormTipoProforma = isPermisoVerFormTipoProforma;
	}
	
	public Boolean getIsPermisoDuplicarTipoProforma() {
		return isPermisoDuplicarTipoProforma;
	}

	public void setIsPermisoDuplicarTipoProforma(Boolean isPermisoDuplicarTipoProforma) {
		this.isPermisoDuplicarTipoProforma = isPermisoDuplicarTipoProforma;
	}
	
	public Boolean getIsPermisoOrdenTipoProforma() {
		return isPermisoOrdenTipoProforma;
	}

	public void setIsPermisoOrdenTipoProforma(Boolean isPermisoOrdenTipoProforma) {
		this.isPermisoOrdenTipoProforma = isPermisoOrdenTipoProforma;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoProforma() {
		return isVisibilidadCeldaNuevoTipoProforma;
	}

	public void setIsVisibilidadCeldaNuevoTipoProforma(Boolean isVisibilidadCeldaNuevoTipoProforma) {
		this.isVisibilidadCeldaNuevoTipoProforma = isVisibilidadCeldaNuevoTipoProforma;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoProforma() {
		return isVisibilidadCeldaDuplicarTipoProforma;
	}

	public void setIsVisibilidadCeldaDuplicarTipoProforma(Boolean isVisibilidadCeldaDuplicarTipoProforma) {
		this.isVisibilidadCeldaDuplicarTipoProforma = isVisibilidadCeldaDuplicarTipoProforma;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoProforma() {
		return isVisibilidadCeldaCopiarTipoProforma;
	}

	public void setIsVisibilidadCeldaCopiarTipoProforma(Boolean isVisibilidadCeldaCopiarTipoProforma) {
		this.isVisibilidadCeldaCopiarTipoProforma = isVisibilidadCeldaCopiarTipoProforma;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoProforma() {
		return isVisibilidadCeldaVerFormTipoProforma;
	}

	public void setIsVisibilidadCeldaVerFormTipoProforma(Boolean isVisibilidadCeldaVerFormTipoProforma) {
		this.isVisibilidadCeldaVerFormTipoProforma = isVisibilidadCeldaVerFormTipoProforma;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoProforma() {
		return isVisibilidadCeldaOrdenTipoProforma;
	}

	public void setIsVisibilidadCeldaOrdenTipoProforma(Boolean isVisibilidadCeldaOrdenTipoProforma) {
		this.isVisibilidadCeldaOrdenTipoProforma = isVisibilidadCeldaOrdenTipoProforma;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoProforma() {
		return isVisibilidadCeldaNuevoRelacionesTipoProforma;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoProforma(Boolean isVisibilidadCeldaNuevoRelacionesTipoProforma) {
		this.isVisibilidadCeldaNuevoRelacionesTipoProforma = isVisibilidadCeldaNuevoRelacionesTipoProforma;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoProforma() {
		return isVisibilidadCeldaModificarTipoProforma;
	}

	public void setIsVisibilidadCeldaModificarTipoProforma(Boolean isVisibilidadCeldaModificarTipoProforma) {
		this.isVisibilidadCeldaModificarTipoProforma = isVisibilidadCeldaModificarTipoProforma;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoProforma() {
		return isVisibilidadCeldaActualizarTipoProforma;
	}

	public void setIsVisibilidadCeldaActualizarTipoProforma(Boolean isVisibilidadCeldaActualizarTipoProforma) {
		this.isVisibilidadCeldaActualizarTipoProforma = isVisibilidadCeldaActualizarTipoProforma;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoProforma() {
		return isVisibilidadCeldaEliminarTipoProforma;
	}

	public void setIsVisibilidadCeldaEliminarTipoProforma(Boolean isVisibilidadCeldaEliminarTipoProforma) {
		this.isVisibilidadCeldaEliminarTipoProforma = isVisibilidadCeldaEliminarTipoProforma;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoProforma() {
		return isVisibilidadCeldaCancelarTipoProforma;
	}

	public void setIsVisibilidadCeldaCancelarTipoProforma(Boolean isVisibilidadCeldaCancelarTipoProforma) {
		this.isVisibilidadCeldaCancelarTipoProforma = isVisibilidadCeldaCancelarTipoProforma;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoProforma() {
		return isVisibilidadCeldaGuardarTipoProforma;
	}

	public void setIsVisibilidadCeldaGuardarTipoProforma(Boolean isVisibilidadCeldaGuardarTipoProforma) {
		this.isVisibilidadCeldaGuardarTipoProforma = isVisibilidadCeldaGuardarTipoProforma;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoProforma() {
		return isVisibilidadCeldaGuardarCambiosTipoProforma;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoProforma(Boolean isVisibilidadCeldaGuardarCambiosTipoProforma) {
		this.isVisibilidadCeldaGuardarCambiosTipoProforma = isVisibilidadCeldaGuardarCambiosTipoProforma;
	}
		
	public TipoProformaSessionBean gettipoproformaSessionBean() {
		return this.tipoproformaSessionBean;
	}
	
	public void settipoproformaSessionBean(TipoProformaSessionBean tipoproformaSessionBean) {
		this.tipoproformaSessionBean=tipoproformaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoProforma(TipoProforma tipoproforma)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipoproforma,null);
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
	
	public void bugActualizarReferenciaActual(TipoProforma tipoproforma,TipoProforma tipoproformaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoProforma(tipoproforma);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoproformaAux.setId(tipoproforma.getId());
		tipoproformaAux.setVersionRow(tipoproforma.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoProforma();
		
			int intSelectedRow = this.jTableDatosTipoProforma.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproforma =(TipoProforma) this.tipoproformaLogic.getTipoProformas().toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoproforma =(TipoProforma) this.tipoproformas.toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoProforma(this.tipoproforma,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProforma(this.tipoproforma);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoproformaValidator.getInvalidValues(this.tipoproforma);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoproformaLogic.setDatosCliente(datosCliente);
			tipoproformaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoproformaAux=new  TipoProforma();
				
				tipoproformaAux.setIsNew(true);
				tipoproformaAux.setIsChanged(true);
				
				tipoproformaAux.setTipoProformaOriginal(this.tipoproforma);
				
				tipoproformaAux.setId(this.tipoproforma.getId());	
				tipoproformaAux.setVersionRow(this.tipoproforma.getVersionRow());	
				tipoproformaAux.setid_empresa(this.tipoproforma.getid_empresa());	
				tipoproformaAux.setcodigo(this.tipoproforma.getcodigo());	
				tipoproformaAux.setnombre(this.tipoproforma.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoproformaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoproformaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoproformaAux,tipoproformaLogic.getTipoProformas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoproformaAux,tipoproformas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoproformaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoproformaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoproformaLogic.saveTipoProformas();//WithConnection
						//tipoproformaLogic.getSetVersionRowTipoProformas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoproforma,tipoproformaAux);
					
					this.refrescarForeignKeysDescripcionesTipoProforma();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoproformaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.proformaLogic.getProformas().addAll(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.proformasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.proformas.addAll(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.proformasEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipoproformaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoproformaLogic.saveTipoProformaRelaciones(tipoproformaAux,this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.proformaLogic.getProformas());//WithConnection
								//tipoproformaLogic.getSetVersionRowTipoProformas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoproforma,tipoproformaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.proformaLogic.setProformas(new ArrayList<Proforma>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.proformas= new ArrayList<Proforma>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoproformaAux.setProformas(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.proformaLogic.getProformas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoproformaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoproformaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoproformaAux,tipoproformaLogic.getTipoProformas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoproformaAux,tipoproformas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoproforma,tipoproformaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoproformaAux=new  TipoProforma();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoproformaSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoproformaSessionBean.getEsGuardarRelacionado() && this.tipoproforma.getId()>=0)) {
						
					tipoproformaAux.setIsNew(false);
				}
				
				tipoproformaAux.setIsDeleted(false);
			
				tipoproformaAux.setId(this.tipoproforma.getId());	
				tipoproformaAux.setVersionRow(this.tipoproforma.getVersionRow());	
				tipoproformaAux.setid_empresa(this.tipoproforma.getid_empresa());	
				tipoproformaAux.setcodigo(this.tipoproforma.getcodigo());	
				tipoproformaAux.setnombre(this.tipoproforma.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoproformaAux,tipoproformaLogic.getTipoProformas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoproformaAux,tipoproformas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoproformaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoproformaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoproformaLogic.saveTipoProformas();//WithConnection
						//tipoproformaLogic.getSetVersionRowTipoProformas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoproforma,tipoproformaAux);
					
					this.refrescarForeignKeysDescripcionesTipoProforma();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoproformaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.proformaLogic.getProformas().addAll(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.proformasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.proformas.addAll(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.proformasEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipoproformaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoproformaLogic.saveTipoProformaRelaciones(tipoproformaAux,this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.proformaLogic.getProformas());//WithConnection
								//tipoproformaLogic.getSetVersionRowTipoProformas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoproforma,tipoproformaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.proformaLogic.setProformas(new ArrayList<Proforma>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.proformas= new ArrayList<Proforma>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoproformaAux.setProformas(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.proformaLogic.getProformas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoproformaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoproformaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoproformaAux,tipoproformaLogic.getTipoProformas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoproformaAux,tipoproformas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoproforma,tipoproformaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoproformaAux=new  TipoProforma();
				
				tipoproformaAux.setIsNew(false);
				tipoproformaAux.setIsChanged(false);
				
				tipoproformaAux.setIsDeleted(true);
				
				tipoproformaAux.setId(this.tipoproforma.getId());	
				tipoproformaAux.setVersionRow(this.tipoproforma.getVersionRow());	
				tipoproformaAux.setid_empresa(this.tipoproforma.getid_empresa());	
				tipoproformaAux.setcodigo(this.tipoproforma.getcodigo());	
				tipoproformaAux.setnombre(this.tipoproforma.getnombre());	
				
				if(this.tipoproformaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoproformaAux.getId()>=0) {	
						this.tipoproformasEliminados.add(tipoproformaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoproformaAux,tipoproformaLogic.getTipoProformas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoproformaAux,tipoproformas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoproformaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoproformaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoproformaLogic.saveTipoProformas();//WithConnection
						//tipoproformaLogic.getSetVersionRowTipoProformas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoproformaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.proformaLogic.getProformas().addAll(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.proformasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.proformas.addAll(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.proformasEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipoproformaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoproformaLogic.saveTipoProformaRelaciones(tipoproformaAux,this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.proformaLogic.getProformas());//WithConnection
								//tipoproformaLogic.getSetVersionRowTipoProformas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.proformaLogic.setProformas(new ArrayList<Proforma>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.proformas= new ArrayList<Proforma>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoproformaAux.setProformas(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.proformaLogic.getProformas());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoproformaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoproformaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoproformaAux,tipoproformaLogic.getTipoProformas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoproformaAux,tipoproformas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproformaLogic.getTipoProformas().addAll(this.tipoproformasEliminados);
					
					tipoproformaLogic.saveTipoProformas();//WithConnection
					//tipoproformaLogic.getSetVersionRowTipoProformas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoProforma();
				
				this.tipoproformasEliminados= new ArrayList<TipoProforma>();		
			}
			
			if(this.tipoproformaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Proforma GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Proforma",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoproforma=tipoproformaAux;
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
      		//this.finishProcessTipoProforma();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoProforma tipoproformaLocal) throws Exception {
		
		if(this.tipoproformaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipoproformaLocal.setProformas(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.proformaLogic.getProformas());
			
			} else {
			
				tipoproformaLocal.setProformas(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.proformas);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoProforma tipoproformaLocal) throws Exception {	
		if(this.tipoproformaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipoproformaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoProformaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoProforma.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoproforma =(TipoProforma) this.tipoproformaLogic.getTipoProformas().toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoproforma =(TipoProforma) this.tipoproformas.toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoproformaValidator.getInvalidValues(this.tipoproforma);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoProforma tipoproforma,List<TipoProforma> tipoproformas) throws Exception {
		try	{		
			TipoProformaConstantesFunciones.actualizarLista(tipoproforma,tipoproformas,this.tipoproformaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoProforma tipoproforma,List<TipoProforma> tipoproformas) throws Exception {
		try	{			
			TipoProformaConstantesFunciones.actualizarSelectedLista(tipoproforma,tipoproformas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoProforma> tipoproformasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoproformasLocal=this.tipoproformaLogic.getTipoProformas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoproformasLocal=this.tipoproformas;
			}
			//ARCHITECTURE
		
			for(TipoProforma tipoproformaLocal:tipoproformasLocal) {
				if(this.permiteMantenimiento(tipoproformaLocal) && tipoproformaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoProformaConstantesFunciones.getTipoProformaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoProformaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProforma.jLabelid_empresaTipoProforma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoProformaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProforma.jLabelcodigoTipoProforma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoProformaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProforma.jLabelnombreTipoProforma,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoProforma!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoProforma.jLabelid_empresaTipoProforma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoProforma.jLabelcodigoTipoProforma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoProforma.jLabelnombreTipoProforma,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Proforma")) {
			if(this.tipoproforma==null) {
				this.tipoproforma= new TipoProforma();
			}

			if(this.tipoproformaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoProforma
				this.setVariablesFormularioToObjetoActualTipoProforma(this.tipoproforma,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProforma(this.tipoproforma);

				this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.getproforma().setTipoProforma(this.tipoproforma);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoProforma--;	
		
		
		this.tipoproformaAux=new TipoProforma();
		
		this.tipoproformaAux.setId(this.iIdNuevoTipoProforma);
		this.tipoproformaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoproformaLogic.getTipoProformas().add(this.tipoproformaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoproformas.add(this.tipoproformaAux);
		}
		//ARCHITECTURE
		
		this.tipoproforma=this.tipoproformaAux;
		
		if(TipoProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoProforma(this.tipoproforma);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoProforma(this.tipoproforma);
		}
				
		//this.setDefaultControlesTipoProforma();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoProforma();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoProforma();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoProforma();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoProforma(this.tipoproformaBean,this.tipoproforma,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoProforma(this.tipoproforma);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoProformaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoproformaSessionBean.getConGuardarRelaciones()) {
			classes=TipoProformaConstantesFunciones.getClassesRelationshipsOfTipoProforma(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoproformaReturnGeneral=tipoproformaLogic.procesarEventosTipoProformasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoproformaLogic.getTipoProformas(),this.tipoproforma,this.tipoproformaParameterGeneral,this.isEsNuevoTipoProforma,classes);//this.tipoproformaLogic.getTipoProforma()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoProforma(this.tipoproformaReturnGeneral,this.tipoproformaBean,false);
		
		if(this.tipoproformaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoProforma(this.tipoproformaReturnGeneral.getTipoProforma());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoProforma(this.tipoproformaReturnGeneral.getTipoProforma());
		}
		
		if(this.tipoproformaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoProforma(this.tipoproformaReturnGeneral.getTipoProforma(),classes);//this.tipoproformaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoProforma(this.tipoproforma,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoProforma();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoProforma();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoProformaBeanSwingJInternalFrameAdditional.RecargarFormTipoProforma(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoProforma(false);
						
			if(tipoproformaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.proformaSessionBean.getEsGuardarRelacionado() && ProformaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProformaActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoProformaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoProforma();
			}
			
			this.actualizarVisualTableDatosTipoProforma();
			
			this.jTableDatosTipoProforma.setRowSelectionInterval(this.getIndiceNuevoTipoProforma(), this.getIndiceNuevoTipoProforma());
			
			this.seleccionarFilaTablaTipoProformaActual();
						
			this.actualizarEstadoCeldasBotonesTipoProforma("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoProforma(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoProforma.jTextFieldcodigoTipoProforma.setEnabled(isHabilitar && this.tipoproformaConstantesFunciones.activarcodigoTipoProforma);
		this.jInternalFrameDetalleFormTipoProforma.jTextAreanombreTipoProforma.setEnabled(isHabilitar && this.tipoproformaConstantesFunciones.activarnombreTipoProforma);	
		//
		this.jInternalFrameDetalleFormTipoProforma.jComboBoxid_empresaTipoProforma.setEnabled(isHabilitar && this.tipoproformaConstantesFunciones.activarid_empresaTipoProforma);
	};
	
	public void setDefaultControlesTipoProforma() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoProforma(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoproformaSessionBean.setConGuardarRelaciones(true);			
			this.tipoproformaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoProforma.jTabbedPaneRelacionesTipoProforma.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.proformaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipoproformaSessionBean.setConGuardarRelaciones(false);			
			this.tipoproformaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoProforma.jTabbedPaneRelacionesTipoProforma.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.proformaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoProforma() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProforma tipoproformaAux:this.tipoproformaLogic.getTipoProformas()) {
				if(tipoproformaAux.getId().equals(this.iIdNuevoTipoProforma)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProforma tipoproformaAux:this.tipoproformas) {
				if(tipoproformaAux.getId().equals(this.iIdNuevoTipoProforma)) {
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
	
	public int getIndiceActualTipoProforma(TipoProforma tipoproforma,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProforma tipoproformaAux:this.tipoproformaLogic.getTipoProformas()) {
				if(tipoproformaAux.getId().equals(tipoproforma.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProforma tipoproformaAux:this.tipoproformas) {
				if(tipoproformaAux.getId().equals(tipoproforma.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoProforma(TipoProforma tipoproformaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProforma tipoproformaAux:this.tipoproformaLogic.getTipoProformas()) {
				if(tipoproformaAux.getTipoProformaOriginal().getId().equals(tipoproformaOriginal.getId())) {
					existe=true;
					tipoproformaOriginal.setId(tipoproformaAux.getId());
					tipoproformaOriginal.setVersionRow(tipoproformaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProforma tipoproformaAux:this.tipoproformas) {
				if(tipoproformaAux.getTipoProformaOriginal().getId().equals(tipoproformaOriginal.getId())) {
					existe=true;
					tipoproformaOriginal.setId(tipoproformaAux.getId());
					tipoproformaOriginal.setVersionRow(tipoproformaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoProforma(Boolean esParaCancelar) throws Exception {
		tipoproformasAux=new ArrayList<TipoProforma>();
		tipoproformaAux=new TipoProforma();
		
		if(!this.tipoproformaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoProforma tipoproformaAux:this.tipoproformaLogic.getTipoProformas()) {
					if(tipoproformaAux.getId()<0) {
						tipoproformasAux.add(tipoproformaAux);
					}		
				}
				this.iIdNuevoTipoProforma=0L;
				this.tipoproformaLogic.getTipoProformas().removeAll(tipoproformasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoProforma tipoproformaAux:this.tipoproformas) {
					if(tipoproformaAux.getId()<0) {
						tipoproformasAux.add(tipoproformaAux);
					}		
				}
				this.iIdNuevoTipoProforma=0L;
				this.tipoproformas.removeAll(tipoproformasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoProforma 
					&& this.tipoproformaLogic.getTipoProformas().size()>0
					) {
					tipoproformaAux=this.tipoproformaLogic.getTipoProformas().get(this.tipoproformaLogic.getTipoProformas().size() - 1);
				
					if(tipoproformaAux.getId()<0) {
						this.tipoproformaLogic.getTipoProformas().remove(tipoproformaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoProforma && this.tipoproformas.size()>0) {
					tipoproformaAux=this.tipoproformas.get(this.tipoproformas.size() - 1);
				
					if(tipoproformaAux.getId()<0) {
						this.tipoproformas.remove(tipoproformaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoProforma(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoproforma.getId()<0) {
				this.tipoproformaLogic.getTipoProformas().remove(this.tipoproforma);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoproforma.getId()<0) {
				this.tipoproformas.remove(this.tipoproforma);
			}
		}			
	}
	
	public void setEstadosInicialesTipoProforma(List<TipoProforma> tipoproformasAux) throws Exception {
		TipoProformaConstantesFunciones.setEstadosInicialesTipoProforma(tipoproformasAux);
	}
	
	public void setEstadosInicialesTipoProforma(TipoProforma tipoproformaAux) throws Exception {
		TipoProformaConstantesFunciones.setEstadosInicialesTipoProforma(tipoproformaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoProformaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoProforma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoProformaActual()) {
				if(!this.isEsNuevoTipoProforma) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoProforma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoProforma=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoProformaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Proforma ?", "MANTENIMIENTO DE Tipo Proforma", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoProforma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoProforma tipoproforma) throws Exception {
		TipoProformaConstantesFunciones.seleccionarAsignar(this.tipoproforma,tipoproforma);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoProforma=this.isPermisoActualizarOriginalTipoProforma;
			
			
			this.seleccionarAsignar(tipoproforma);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoProformaConstantesFunciones.quitarEspaciosTipoProforma(this.tipoproforma,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoProforma("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoproformaSessionBean.setsFuncionBusquedaRapida(this.tipoproformaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoProforma) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoProforma(esParaCancelar);				
				this.cancelarNuevoTipoProforma(esParaCancelar);								
			}
			
			this.tipoproforma=new TipoProforma();
			
			this.inicializarTipoProforma();
			
			this.actualizarEstadoCeldasBotonesTipoProforma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoProforma() throws Exception {
		try {
			TipoProformaConstantesFunciones.inicializarTipoProforma(this.tipoproforma);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoproformaLogic.getTipoProformas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoProformas(String sAccionBusqueda,List<TipoProforma> tipoproformasParaReportes) throws Exception {
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
					sPathReporteFinal="TipoProforma"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoProformaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoProformaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoProforma"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Proformas");		
		parameters.put("busquedapor", TipoProformaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Proforma.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoProformaLogic tipoproformaLogicAuxiliar=new TipoProformaLogic();
					tipoproformaLogicAuxiliar.setDatosCliente(tipoproformaLogic.getDatosCliente());				
					tipoproformaLogicAuxiliar.setTipoProformas(tipoproformasParaReportes);
					
					tipoproformaLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoProformaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipoproformasParaReportes=tipoproformaLogicAuxiliar.getTipoProformas();
					
					//tipoproformaLogic.getNewConnexionToDeep();
					
					//for (TipoProforma tipoproforma:tipoproformasParaReportes) {
					//	tipoproformaLogic.deepLoad(tipoproforma, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipoproformaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipoproformaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileProforma = AuxiliarReportes.class.getResourceAsStream("ProformaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_proforma", reportFileProforma);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoProforma=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoProformaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoProformaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoProforma=new JRBeanArrayDataSource(TipoProformaJInternalFrame.TraerTipoProformaBeans(tipoproformasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoProforma);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoProformaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoProformaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoProformaBean.TraerTipoProformaBeans(tipoproformasParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoProformas(sAccionBusqueda,sTipoArchivoReporte,tipoproformasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoProformas(sAccionBusqueda,sTipoArchivoReporte,tipoproformasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoProformaActionPerformed(null);
					//this.generarExcelReporteTipoProformas(sAccionBusqueda,sTipoArchivoReporte,tipoproformasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoProformas(sAccionBusqueda,sTipoArchivoReporte,tipoproformasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoProformas(sAccionBusqueda,sTipoArchivoReporte,tipoproformasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoProformas(sAccionBusqueda,sTipoArchivoReporte,tipoproformasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoProformas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoProforma> tipoproformasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoproforma";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoProformas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoProforma("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoProforma tipoproforma : tipoproformasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoProformaConstantesFunciones.generarExcelReporteDataTipoProforma("NORMAL",row,workbook,tipoproforma,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Proforma",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoProforma(String sTipo,Row row,Workbook workbook) {
		
		TipoProformaConstantesFunciones.generarExcelReporteHeaderTipoProforma(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoProformas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoProforma> tipoproformasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoproforma_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoProformas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoProforma tipoproforma : tipoproformasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoProformaConstantesFunciones.getTipoProformaDescripcion(tipoproforma));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoProformaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoProformaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoproforma.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoProformaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoProformaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoproforma.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoProformaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoProformaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoproforma.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Proforma",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoProformas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoProforma> tipoproformasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoProforma> tipoproformasRespaldo=null;
		
		classes=TipoProformaConstantesFunciones.getClassesRelationshipsOfTipoProforma(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoproformaLogic.setDatosCliente(this.datosCliente);
		this.tipoproformaLogic.setDatosDeep(this.datosDeep);
		this.tipoproformaLogic.setIsConDeep(true);
		
		tipoproformasRespaldo=this.tipoproformaLogic.getTipoProformas();
		
		this.tipoproformaLogic.setTipoProformas(tipoproformasParaReportes);	
		this.tipoproformaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoproformasParaReportes=this.tipoproformaLogic.getTipoProformas();
		this.tipoproformaLogic.setTipoProformas(tipoproformasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoproforma_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoProformas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoProforma("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoProforma tipoproforma : tipoproformasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoProforma("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoProformaConstantesFunciones.generarExcelReporteDataTipoProforma("NORMAL",row,workbook,tipoproforma,cellStyleDataAux);
		
			
			


				//Proforma
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ProformaConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoproforma.getProformas()!=null && tipoproforma.getProformas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ProformaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ProformaConstantesFunciones.generarExcelReporteHeaderProforma("RELACIONADO",row,workbook);
				}

				if(tipoproforma.getProformas()!=null) {
					i2=0;
					for(Proforma proforma : tipoproforma.getProformas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ProformaConstantesFunciones.generarExcelReporteDataProforma("RELACIONADO",row,workbook,proforma,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoProformaConstantesFunciones.getTipoProformaDescripcion(tipoproforma));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Proforma",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoProforma.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProforma.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoProforma.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProforma.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoProforma() throws Exception {		
		this.startProcessTipoProforma(true);
	}
	
	public void startProcessTipoProforma(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoProforma ,this.jPanelParametrosReportesTipoProforma, this.jScrollPanelDatosTipoProforma,this.jPanelPaginacionTipoProforma, this.jScrollPanelDatosEdicionTipoProforma, this.jPanelAccionesTipoProforma,this.jPanelAccionesFormularioTipoProforma,this.jmenuBarTipoProforma,this.jmenuBarDetalleTipoProforma,this.jTtoolBarTipoProforma,this.jTtoolBarDetalleTipoProforma);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoProforma=this.jTabbedPaneBusquedasTipoProforma; 
		
		final JPanel jPanelParametrosReportesTipoProforma=this.jPanelParametrosReportesTipoProforma;
		//final JScrollPane jScrollPanelDatosTipoProforma=this.jScrollPanelDatosTipoProforma;
		final JTable jTableDatosTipoProforma=this.jTableDatosTipoProforma;		
		final JPanel jPanelPaginacionTipoProforma=this.jPanelPaginacionTipoProforma;
		//final JScrollPane jScrollPanelDatosEdicionTipoProforma=this.jScrollPanelDatosEdicionTipoProforma;
		final JPanel jPanelAccionesTipoProforma=this.jPanelAccionesTipoProforma;
		
		JPanel jPanelCamposAuxiliarTipoProforma=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoProforma=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoProforma!=null) {
			jPanelCamposAuxiliarTipoProforma=this.jInternalFrameDetalleFormTipoProforma.jPanelCamposTipoProforma;
			jPanelAccionesFormularioAuxiliarTipoProforma=this.jInternalFrameDetalleFormTipoProforma.jPanelAccionesFormularioTipoProforma;
		}
		
		final JPanel jPanelCamposTipoProforma=jPanelCamposAuxiliarTipoProforma;
		final JPanel jPanelAccionesFormularioTipoProforma=jPanelAccionesFormularioAuxiliarTipoProforma;
		
		
		final JMenuBar jmenuBarTipoProforma=this.jmenuBarTipoProforma;
		final JToolBar jTtoolBarTipoProforma=this.jTtoolBarTipoProforma;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoProforma=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoProforma=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoProforma!=null) {
			jmenuBarDetalleAuxiliarTipoProforma=this.jInternalFrameDetalleFormTipoProforma.jmenuBarDetalleTipoProforma;
			jTtoolBarDetalleAuxiliarTipoProforma=this.jInternalFrameDetalleFormTipoProforma.jTtoolBarDetalleTipoProforma;
		}
		
		final JMenuBar jmenuBarDetalleTipoProforma=jmenuBarDetalleAuxiliarTipoProforma;
		final JToolBar jTtoolBarDetalleTipoProforma=jTtoolBarDetalleAuxiliarTipoProforma;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoProforma;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoProforma;
			processRunnable.jTableDatos=jTableDatosTipoProforma;
			processRunnable.jPanelCampos=jPanelCamposTipoProforma;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoProforma;
			processRunnable.jPanelAcciones=jPanelAccionesTipoProforma;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoProforma;
			
			
			processRunnable.jmenuBar=jmenuBarTipoProforma;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoProforma;
			processRunnable.jTtoolBar=jTtoolBarTipoProforma;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoProforma;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoProforma ,jPanelParametrosReportesTipoProforma,jTableDatosTipoProforma, /*jScrollPanelDatosTipoProforma,*/jPanelCamposTipoProforma,jPanelPaginacionTipoProforma, /*jScrollPanelDatosEdicionTipoProforma,*/ jPanelAccionesTipoProforma,jPanelAccionesFormularioTipoProforma,jmenuBarTipoProforma,jmenuBarDetalleTipoProforma,jTtoolBarTipoProforma,jTtoolBarDetalleTipoProforma);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoProforma ,jPanelParametrosReportesTipoProforma, jScrollPanelDatosTipoProforma,jPanelPaginacionTipoProforma, jScrollPanelDatosEdicionTipoProforma, jPanelAccionesTipoProforma,jPanelAccionesFormularioTipoProforma,jmenuBarTipoProforma,jmenuBarDetalleTipoProforma,jTtoolBarTipoProforma,jTtoolBarDetalleTipoProforma);
						
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
	
	public void finishProcessTipoProforma() {// throws Exception 
		this.finishProcessTipoProforma(true);
	}
	
	public void finishProcessTipoProforma(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoProforma ,this.jPanelParametrosReportesTipoProforma, this.jScrollPanelDatosTipoProforma,this.jPanelPaginacionTipoProforma, this.jScrollPanelDatosEdicionTipoProforma, this.jPanelAccionesTipoProforma,this.jPanelAccionesFormularioTipoProforma,this.jmenuBarTipoProforma,this.jmenuBarDetalleTipoProforma,this.jTtoolBarTipoProforma,this.jTtoolBarDetalleTipoProforma);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoProforma=this.jTabbedPaneBusquedasTipoProforma; 
		
		final JPanel jPanelParametrosReportesTipoProforma=this.jPanelParametrosReportesTipoProforma;
		//final JScrollPane jScrollPanelDatosTipoProforma=this.jScrollPanelDatosTipoProforma;
		final JTable jTableDatosTipoProforma=this.jTableDatosTipoProforma;		
		final JPanel jPanelPaginacionTipoProforma=this.jPanelPaginacionTipoProforma;
		//final JScrollPane jScrollPanelDatosEdicionTipoProforma=this.jScrollPanelDatosEdicionTipoProforma;
		final JPanel jPanelAccionesTipoProforma=this.jPanelAccionesTipoProforma;
		
		JPanel jPanelCamposAuxiliarTipoProforma=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoProforma=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoProforma!=null) {
			jPanelCamposAuxiliarTipoProforma=this.jInternalFrameDetalleFormTipoProforma.jPanelCamposTipoProforma;
			jPanelAccionesFormularioAuxiliarTipoProforma=this.jInternalFrameDetalleFormTipoProforma.jPanelAccionesFormularioTipoProforma;
		}
		
		final JPanel jPanelCamposTipoProforma=jPanelCamposAuxiliarTipoProforma;
		final JPanel jPanelAccionesFormularioTipoProforma=jPanelAccionesFormularioAuxiliarTipoProforma;
		
		
		final JMenuBar jmenuBarTipoProforma=this.jmenuBarTipoProforma;		
		final JToolBar jTtoolBarTipoProforma=this.jTtoolBarTipoProforma;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoProforma=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoProforma=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoProforma!=null) {
			jmenuBarDetalleAuxiliarTipoProforma=this.jInternalFrameDetalleFormTipoProforma.jmenuBarDetalleTipoProforma;
			jTtoolBarDetalleAuxiliarTipoProforma=this.jInternalFrameDetalleFormTipoProforma.jTtoolBarDetalleTipoProforma;		
		}
		
		final JMenuBar jmenuBarDetalleTipoProforma=jmenuBarDetalleAuxiliarTipoProforma;
		final JToolBar jTtoolBarDetalleTipoProforma=jTtoolBarDetalleAuxiliarTipoProforma;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoProforma;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoProforma;
			processRunnable.jTableDatos=jTableDatosTipoProforma;
			processRunnable.jPanelCampos=jPanelCamposTipoProforma;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoProforma;
			processRunnable.jPanelAcciones=jPanelAccionesTipoProforma;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoProforma;
			
			
			processRunnable.jmenuBar=jmenuBarTipoProforma;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoProforma;
			processRunnable.jTtoolBar=jTtoolBarTipoProforma;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoProforma;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoProforma ,jPanelParametrosReportesTipoProforma, jTableDatosTipoProforma,/*jScrollPanelDatosTipoProforma,*/jPanelCamposTipoProforma,jPanelPaginacionTipoProforma, /*jScrollPanelDatosEdicionTipoProforma,*/ jPanelAccionesTipoProforma,jPanelAccionesFormularioTipoProforma,jmenuBarTipoProforma,jmenuBarDetalleTipoProforma,jTtoolBarTipoProforma,jTtoolBarDetalleTipoProforma));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoProforma(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoProforma(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoProforma(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoProforma(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoProforma,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoProforma,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoProforma(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoProforma,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoProforma,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoproformaConstantesFunciones.getsFinalQueryTipoProforma();
		String  finalQueryPaginacionTodos=this.tipoproformaConstantesFunciones.getsFinalQueryTipoProforma();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoProformaConstantesFunciones.getArrayColumnasGlobalesNoTipoProforma(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoProformaConstantesFunciones.getArrayColumnasGlobalesTipoProforma(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoProformaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoproformasEliminados= new ArrayList<TipoProforma>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoProforma();
		
				///*TipoProformaSessionBean*/this.tipoproformaSessionBean=new TipoProformaSessionBean();
			
			if(this.tipoproformaSessionBean==null) {
				this.tipoproformaSessionBean=new TipoProformaSessionBean();
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
					this.iNumeroPaginacion=TipoProformaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoProformaConstantesFunciones.getClassesForeignKeysOfTipoProforma(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoproforma."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoproformasAux= new ArrayList<TipoProforma>();
			
				
			tipoproformaLogic.setDatosCliente(this.datosCliente);
			tipoproformaLogic.setDatosDeep(this.datosDeep);
			tipoproformaLogic.setIsConDeep(true);
			
			
			tipoproformaLogic.getTipoProformaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoproformaLogic.getTodosTipoProformas(finalQueryGlobal,pagination);
					
					//tipoproformaLogic.getTodosTipoProformasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoproformaLogic.getTipoProformas()==null|| tipoproformaLogic.getTipoProformas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoproformasAux= new ArrayList<TipoProforma>();
							tipoproformasAux.addAll(tipoproformaLogic.getTipoProformas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoproformasAux= new ArrayList<TipoProforma>();
							tipoproformasAux.addAll(tipoproformas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoproformaLogic.getTodosTipoProformas(finalQueryGlobal+"",this.pagination);												
							
							//tipoproformaLogic.getTodosTipoProformasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoProformas("Todos",tipoproformaLogic.getTipoProformas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoproformaLogic.setTipoProformas(new ArrayList<TipoProforma>());					
							tipoproformaLogic.getTipoProformas().addAll(tipoproformasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoproformas=new ArrayList<TipoProforma>();
							tipoproformas.addAll(tipoproformasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoProforma=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoProforma=this.idActual;
				
				} else if(this.idTipoProformaActual!=null && this.idTipoProformaActual!=0L) {
					idTipoProforma=idTipoProformaActual;
				}
				
					
				this.sDetalleReporte=TipoProformaConstantesFunciones.getDetalleIndicePorId(idTipoProforma);
				
				this.tipoproformas=new ArrayList<TipoProforma>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoproformaLogic.getEntity(idTipoProforma);
					
					//tipoproformaLogic.getEntityWithConnection(idTipoProforma);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoproformaLogic.setTipoProformas(new ArrayList<TipoProforma>());
					tipoproformaLogic.getTipoProformas().add(tipoproformaLogic.getTipoProforma());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoproformas=new ArrayList<TipoProforma>();
					this.tipoproformas.add(tipoproforma);
				}
				
				if(tipoproformaLogic.getTipoProforma()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoProformaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoproformaLogic.getTipoProformasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoProformaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoProformaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoproformaLogic.getTipoProformas()==null||tipoproformaLogic.getTipoProformas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoproformas==null|| tipoproformas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoproformasAux=new ArrayList<TipoProforma>();
						tipoproformasAux.addAll(tipoproformaLogic.getTipoProformas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoproformasAux=new ArrayList<TipoProforma>();
							tipoproformasAux.addAll(tipoproformas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoproformaLogic.getTipoProformasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoProformaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoProformaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoProformas("FK_IdEmpresa",tipoproformaLogic.getTipoProformas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoProformas("FK_IdEmpresa",tipoproformas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoproformaLogic.setTipoProformas(new ArrayList<TipoProforma>());
						tipoproformaLogic.getTipoProformas().addAll(tipoproformasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoproformas=new ArrayList<TipoProforma>();
							tipoproformas.addAll(tipoproformasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoProforma();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoProforma();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoproformaLogic.getTipoProformas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoproformas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoproformaLogic.getTipoProformas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoproformas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoProforma tipoproforma) {
		Boolean permite=true;
		
		if(this.tipoproforma.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoProformaConstantesFunciones.getOrderByListaTipoProforma();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoProformaConstantesFunciones.getOrderByListaTipoProforma();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProforma tipoproforma:tipoproformaLogic.getTipoProformas()) {
				if(tipoproforma.getsType().equals(Constantes2.S_TOTALES)) {
					tipoproformaTotales=tipoproforma;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProforma tipoproforma:this.tipoproformas) {
				if(tipoproforma.getsType().equals(Constantes2.S_TOTALES)) {
					tipoproformaTotales=tipoproforma;
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
			this.tipoproformaAux=new TipoProforma();
			this.tipoproformaAux.setsType(Constantes2.S_TOTALES);
			this.tipoproformaAux.setIsNew(false);
			this.tipoproformaAux.setIsChanged(false);
			this.tipoproformaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoProformaConstantesFunciones.TotalizarValoresFilaTipoProforma(this.tipoproformaLogic.getTipoProformas(),this.tipoproformaAux);
				
				this.tipoproformaLogic.getTipoProformas().add(this.tipoproformaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoProformaConstantesFunciones.TotalizarValoresFilaTipoProforma(this.tipoproformas,this.tipoproformaAux);
				
				this.tipoproformas.add(this.tipoproformaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoproformaTotales=new TipoProforma();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoproformaLogic.getTipoProformas().remove(tipoproformaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoproformas.remove(tipoproformaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoproformaTotales=new TipoProforma();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProforma tipoproforma:tipoproformaLogic.getTipoProformas()) {
				if(tipoproforma.getsType().equals(Constantes2.S_TOTALES)) {
					tipoproformaTotales=tipoproforma;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoProformaConstantesFunciones.TotalizarValoresFilaTipoProforma(this.tipoproformaLogic.getTipoProformas(),tipoproformaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProforma tipoproforma:this.tipoproformas) {
				if(tipoproforma.getsType().equals(Constantes2.S_TOTALES)) {
					tipoproformaTotales=tipoproforma;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoProformaConstantesFunciones.TotalizarValoresFilaTipoProforma(this.tipoproformas,tipoproformaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoProformasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoProformasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoproformaLogic.getTipoProformasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoProforma() {
		this.isPermisoTodoTipoProforma=false;
		this.isPermisoNuevoTipoProforma=false;
		this.isPermisoActualizarTipoProforma=false;
		this.isPermisoActualizarOriginalTipoProforma=false;
		this.isPermisoEliminarTipoProforma=false;
		this.isPermisoGuardarCambiosTipoProforma=false;
		this.isPermisoConsultaTipoProforma=false;
		this.isPermisoBusquedaTipoProforma=false;
		this.isPermisoReporteTipoProforma=false;		
		this.isPermisoOrdenTipoProforma=false;		
		this.isPermisoPaginacionMedioTipoProforma=false;		
		this.isPermisoPaginacionAltoTipoProforma=false;
		this.isPermisoPaginacionTodoTipoProforma=false;
		this.isPermisoCopiarTipoProforma=false;		
		this.isPermisoVerFormTipoProforma=false;		
		this.isPermisoDuplicarTipoProforma=false;		
		this.isPermisoOrdenTipoProforma=false;		
	}
	
	public void setPermisosUsuarioTipoProforma(Boolean isPermiso) {
		this.isPermisoTodoTipoProforma=isPermiso;
		this.isPermisoNuevoTipoProforma=isPermiso;
		this.isPermisoActualizarTipoProforma=isPermiso;
		this.isPermisoActualizarOriginalTipoProforma=isPermiso;
		this.isPermisoEliminarTipoProforma=isPermiso;
		this.isPermisoGuardarCambiosTipoProforma=isPermiso;
		this.isPermisoConsultaTipoProforma=isPermiso;
		this.isPermisoBusquedaTipoProforma=isPermiso;
		this.isPermisoReporteTipoProforma=isPermiso;
		this.isPermisoOrdenTipoProforma=isPermiso;		
		this.isPermisoPaginacionMedioTipoProforma=isPermiso;		
		this.isPermisoPaginacionAltoTipoProforma=isPermiso;		
		this.isPermisoPaginacionTodoTipoProforma=isPermiso;		
		this.isPermisoCopiarTipoProforma=isPermiso;		
		this.isPermisoVerFormTipoProforma=isPermiso;		
		this.isPermisoDuplicarTipoProforma=isPermiso;
		this.isPermisoOrdenTipoProforma=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoProforma(Boolean isPermiso) {
		//this.isPermisoTodoTipoProforma=isPermiso;
		this.isPermisoNuevoTipoProforma=isPermiso;
		this.isPermisoActualizarTipoProforma=isPermiso;
		this.isPermisoActualizarOriginalTipoProforma=isPermiso;
		this.isPermisoEliminarTipoProforma=isPermiso;
		this.isPermisoGuardarCambiosTipoProforma=isPermiso;
		//this.isPermisoConsultaTipoProforma=isPermiso;
		//this.isPermisoBusquedaTipoProforma=isPermiso;
		//this.isPermisoReporteTipoProforma=isPermiso;
		//this.isPermisoOrdenTipoProforma=isPermiso;		
		//this.isPermisoPaginacionMedioTipoProforma=isPermiso;		
		//this.isPermisoPaginacionAltoTipoProforma=isPermiso;		
		//this.isPermisoPaginacionTodoTipoProforma=isPermiso;		
		//this.isPermisoCopiarTipoProforma=isPermiso;		
		//this.isPermisoDuplicarTipoProforma=isPermiso;
		//this.isPermisoOrdenTipoProforma=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoProformaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ProformaConstantesFunciones.SNOMBREOPCION);
		
		if(TipoProformaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosProforma=false;
		this.isTienePermisosProforma=this.verificarGetPermisosUsuarioOpcionTipoProformaClaseRelacionada(this.opcionsRelacionadas,ProformaConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoProforma(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoProformaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosProforma=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoProformaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoProformaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoProformaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosProforma && this.jInternalFrameDetalleFormTipoProforma!=null && this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoProforma.jTabbedPaneRelacionesTipoProforma.remove(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoProforma() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoProformaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoproformaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoProformaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoProforma=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoProforma=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoProforma=this.isPermisoActualizarTipoProforma;
			this.isPermisoEliminarTipoProforma=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoProforma=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoProforma=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoProforma=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoProforma=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoProforma=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoProforma=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoProforma=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoProforma=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoProforma=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoProforma=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoProforma=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoProforma=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoProforma=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoproformaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoProforma.setToolTipText(this.jTableDatosTipoProforma.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoProforma(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoProforma(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoProformaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoProformaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoProforma() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosProforma && this.tipoproformaConstantesFunciones.mostrarProformaTipoProforma && !TipoProformaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Proforma");
			reporte.setsDescripcion("Proforma");
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
	public void inicializarCombosForeignKeyTipoProformaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoProformaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoProformaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoProformaListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoProformaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoProformaParameterReturnGeneral tipoproformaReturnGeneral=new TipoProformaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipoproformaConstantesFunciones.cargarid_empresaTipoProforma)
					 || (this.esRecargarFks && this.tipoproformaConstantesFunciones.cargarid_empresaTipoProforma)) {

					if(!this.tipoproformaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipoproformaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipoproformaReturnGeneral=tipoproformaLogic.cargarCombosLoteForeignKeyTipoProforma(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipoproformaReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoProforma()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipoproformaSessionBean==null) {
				this.tipoproformaSessionBean=new TipoProformaSessionBean();
			}

			if(!this.tipoproformaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoProforma()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoProforma(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoProforma()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoProforma();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoProforma(TipoProforma tipoproforma)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoProforma(TipoProforma tipoproforma,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoProforma()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoProforma()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoProforma()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoProforma()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoProforma()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoProforma()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoProforma(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoProforma()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoProforma.jComboBoxid_empresaTipoProforma!=null && this.jInternalFrameDetalleFormTipoProforma.jComboBoxid_empresaTipoProforma.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoProforma.jComboBoxid_empresaTipoProforma.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoProformaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoProformaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoProformaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoproformaSessionBean=new TipoProformaSessionBean(); 
		this.tipoproformaConstantesFunciones=new TipoProformaConstantesFunciones(); 
		this.tipoproformaBean=new TipoProforma();//(this.tipoproformaConstantesFunciones); 		
		this.tipoproformaReturnGeneral=new TipoProformaParameterReturnGeneral(); 
		
		this.tipoproformaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoproformaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoProformaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoProformaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoProformaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoProforma(true);
			
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
			
			this.tipoproformaConstantesFunciones=new TipoProformaConstantesFunciones(); 
			this.tipoproformaBean=new TipoProforma();//this.tipoproformaConstantesFunciones); 			
			this.tipoproformaReturnGeneral=new TipoProformaParameterReturnGeneral(); 
		
			TipoProformaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Proforma Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoproforma=new TipoProforma();
			this.tipoproformas = new ArrayList<TipoProforma>();
			this.tipoproformasAux = new ArrayList<TipoProforma>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproformaLogic=new TipoProformaLogic();
				this.tipoproformaLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoproformaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoproformaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoProforma);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoProforma!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoProforma);	
					}
					
					if(this.jInternalFrameImportacionTipoProforma!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoProforma);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoProforma!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoProforma);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoProforma!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoProforma);
				this.jInternalFrameDetalleFormTipoProforma.setVisible(false);
				this.jInternalFrameDetalleFormTipoProforma.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoProforma!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoProforma);
					this.jInternalFrameReporteDinamicoTipoProforma.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoProforma.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoProforma!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoProforma);
					this.jInternalFrameImportacionTipoProforma.setVisible(false);
					this.jInternalFrameImportacionTipoProforma.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoProforma!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoProforma);
					this.jInternalFrameOrderByTipoProforma.setVisible(false);
					this.jInternalFrameOrderByTipoProforma.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoProformaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoProformaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoproformaReturnGeneral=new TipoProformaParameterReturnGeneral();
			
			this.tipoproformaParameterGeneral=new TipoProformaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoproformaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoproformaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoProformaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoproformaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ProformaConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoProformaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoproformaSessionBean.getEsGuardarRelacionado(),this.tipoproformaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoProformaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoproformaSessionBean.getEsGuardarRelacionado(),this.tipoproformaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoProforma=false;
			this.isVisibilidadCeldaDuplicarTipoProforma=true;
			this.isVisibilidadCeldaCopiarTipoProforma=true;
			this.isVisibilidadCeldaVerFormTipoProforma=true;
			this.isVisibilidadCeldaOrdenTipoProforma=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoProforma=false;
			this.isVisibilidadCeldaModificarTipoProforma=false;
			this.isVisibilidadCeldaActualizarTipoProforma=false;
			this.isVisibilidadCeldaEliminarTipoProforma=false;
			this.isVisibilidadCeldaCancelarTipoProforma=false;
			this.isVisibilidadCeldaGuardarTipoProforma=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProforma=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoProforma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoProforma();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoProforma(false);
			
			this.setPermisosUsuarioTipoProforma();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoproformaSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoproformaSessionBean.getEsGuardarRelacionado() && this.tipoproformaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoProformaClasesRelacionadas();
			}
			
			if(this.tipoproformaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoProformaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoProformaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoProforma();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoProforma();
			}
			
			if(!this.isPermisoBusquedaTipoProforma) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoProforma.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoproformaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoProforma,this.isPermisoPaginacionMedioTipoProforma,this.isPermisoPaginacionTodoTipoProforma);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoProformaConstantesFunciones.getTiposSeleccionarTipoProforma());
				
				this.tiposColumnasSelect=TipoProformaConstantesFunciones.getTiposSeleccionarTipoProforma(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoProforma();				
				//this.tiposRelacionesSelect=TipoProformaConstantesFunciones.getTiposRelacionesTipoProforma(true);
				
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
			//if(!this.tipoproformaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoProforma();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoProforma(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoProforma(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoProforma() ;
			
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
			
			
			this.proformaLogic=new ProformaLogic(); 
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
				tipoproformaImplementable= (TipoProformaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoProformaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoproformaImplementableHome= (TipoProformaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoProformaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoproformas= new ArrayList<TipoProforma>();
			this.tipoproformasEliminados= new ArrayList<TipoProforma>();
						
			this.isEsNuevoTipoProforma=false;
			this.esParaAccionDesdeFormularioTipoProforma=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoProforma(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoProforma();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoproformaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoProformaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoProformaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoProforma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoProforma(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoProforma!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoProforma();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoProforma();
			}
			
			TipoProformaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoProforma.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoProforma.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoProforma.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproformaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoProforma(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoProforma: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproformaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproformaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoProforma() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ProformaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ProformaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoProforma")) {
				iIndex=this.jInternalFrameDetalleFormTipoProforma.jTabbedPaneRelacionesTipoProforma.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoProforma.jTabbedPaneRelacionesTipoProforma.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoProforma.getSelectedRow();	
				
				

				if(sTitle.equals("Proformas")) {
					if(!ProformaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoProforma();

						this.cargarParteTabPanelRelacionadaProforma(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoProforma();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaProforma(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoProforma.cargarSessionConBeanSwingJInternalFrameProforma(false,true,iIndex);
		this.jButtonProformaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaProforma();

		//this.jTabbedPaneRelacionesTipoProforma.updateUI();
		//this.jTabbedPaneRelacionesTipoProforma.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoProforma.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Proforma")) {
				int row=this.jTableDatosTipoProforma.getSelectedRow();
				jButtonProformaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipoproformaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Proforma")) {

					if(this.isTienePermisosProforma && this.tipoproformaConstantesFunciones.mostrarProformaTipoProforma && !TipoProformaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Proformas"+"("+ProformaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Proformas");

						if(tipoproformaConstantesFunciones.resaltarProformaTipoProforma!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoproformaConstantesFunciones.resaltarProformaTipoProforma);
						}

						jmenuItem.setEnabled(this.tipoproformaConstantesFunciones.activarProformaTipoProforma);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Proforma"));

						

						this.jInternalFrameDetalleFormTipoProforma.jmenuDetalleTipoProforma.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoProforma(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoProforma(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoProforma(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoProformaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoProforma();
		
		this.cargarCombosFrameForeignKeyTipoProforma();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoProforma();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoProforma();
		}
	}
	
	
	
	public void jButtonNuevoTipoProformaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoproformaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoProforma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
			
			
			if(jTableDatosTipoProforma.getRowCount()>=1) {
				jTableDatosTipoProforma.removeRowSelectionInterval(0, jTableDatosTipoProforma.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoProforma=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoProforma(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoProforma(true);			
			//this.tipoproforma=new TipoProforma();
			//this.tipoproforma.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoProforma(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoProforma() ;
			
			if(TipoProformaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoProforma(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoproforma);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoproforma);				
			
			TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
			
			if(this.tipoproformaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoProforma: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoProformaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoProforma> tipoproformasSeleccionados=new ArrayList<TipoProforma>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoProforma.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoProforma.getSelectedRows().length;			
			}
			
			tipoproformasSeleccionados=this.getTipoProformasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoProforma--;			
				//TipoProforma tipoproformaAux= new TipoProforma();			
				//tipoproformaAux.setId(this.iIdNuevoTipoProforma);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoProforma tipoproformaOrigen=new TipoProforma();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoProforma tipoproformaOrigen : tipoproformasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoProforma.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoproformaOrigen =(TipoProforma) this.tipoproformaLogic.getTipoProformas().toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoproformaOrigen =(TipoProforma) this.tipoproformas.toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoProforma();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoproforma.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoProforma(tipoproformaOrigen,this.tipoproforma,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProforma(this.tipoproforma);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoproformaLogic.getTipoProformas().add(this.tipoproformaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoproformas.add(this.tipoproformaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoProforma(false);
				
				this.jTableDatosTipoProforma.setRowSelectionInterval(this.getIndiceNuevoTipoProforma(), this.getIndiceNuevoTipoProforma());
				
				int iLastRow =  this.jTableDatosTipoProforma.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoProforma.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoProforma.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoProforma(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoProforma> tipoproformasSeleccionados=new ArrayList<TipoProforma>();									
		
			TipoProforma tipoproformaOrigen=new TipoProforma();
			TipoProforma tipoproformaDestino=new TipoProforma();
				
			tipoproformasSeleccionados=this.getTipoProformasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoProforma.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoproformasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoProforma.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoproformaOrigen =(TipoProforma) this.tipoproformaLogic.getTipoProformas().toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoproformaOrigen =(TipoProforma) this.tipoproformas.toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoproformaDestino =(TipoProforma) this.tipoproformaLogic.getTipoProformas().toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoproformaDestino =(TipoProforma) this.tipoproformas.toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoproformaOrigen =tipoproformasSeleccionados.get(0);
				tipoproformaDestino =tipoproformasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoProforma(tipoproformaOrigen,tipoproformaDestino,true,false);
				
				tipoproformaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoproformaDestino,tipoproformaLogic.getTipoProformas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoproformaDestino,tipoproformas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoProforma(false);
				
				//this.jTableDatosTipoProforma.setRowSelectionInterval(this.getIndiceNuevoTipoProforma(), this.getIndiceNuevoTipoProforma());
				
				int iLastRow =  this.jTableDatosTipoProforma.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoProforma.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoProforma.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoProforma(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoProforma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoProforma.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoProforma.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoProforma.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoProforma.setVisible(!isVisible);
			this.jPanelPaginacionTipoProforma.setVisible(!isVisible);
			this.jPanelAccionesTipoProforma.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoProforma();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoProforma();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoProforma();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoProforma();
			
			this.abrirFrameOrderByTipoProforma();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoProforma();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoProforma(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoProforma);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoProforma.isMaximum()) {
					this.jInternalFrameDetalleFormTipoProforma.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoProforma.setSize(this.jInternalFrameDetalleFormTipoProforma.iWidthFormulario,this.jInternalFrameDetalleFormTipoProforma.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoProforma.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoProforma.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoProforma.isMaximum()) {
						this.jInternalFrameDetalleFormTipoProforma.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoProforma.jContentPaneDetalleTipoProforma.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoProforma.jTabbedPaneRelacionesTipoProforma.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoProforma.jContentPaneDetalleTipoProforma.getWidth(),TipoProformaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoProforma.jTabbedPaneRelacionesTipoProforma.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoProforma.jContentPaneDetalleTipoProforma.getWidth(),TipoProformaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoProforma.jTabbedPaneRelacionesTipoProforma.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoProforma.jContentPaneDetalleTipoProforma.getWidth(),TipoProformaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ProformaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaProforma();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoProforma.setVisible(true);
	        this.jInternalFrameDetalleFormTipoProforma.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoProforma() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoProforma==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoProforma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoProforma,false,this);
				} else {
					this.jInternalFrameOrderByTipoProforma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoProforma,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoProforma);
				this.jInternalFrameOrderByTipoProforma.setVisible(false);
				this.jInternalFrameOrderByTipoProforma.setSelected(false);
				
				this.jInternalFrameOrderByTipoProforma.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoProforma"));
				
				this.inicializarActualizarBindingTablaOrderByTipoProforma();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoProforma() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoProforma==null) {
				
				this.jInternalFrameImportacionTipoProforma=new ImportacionJInternalFrame(TipoProformaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoProforma);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoProforma);
				this.jInternalFrameImportacionTipoProforma.setVisible(false);
				this.jInternalFrameImportacionTipoProforma.setSelected(false);


				this.jInternalFrameImportacionTipoProforma.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoProforma"));
				this.jInternalFrameImportacionTipoProforma.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoProforma"));
				this.jInternalFrameImportacionTipoProforma.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoProforma"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoProforma() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoProforma==null) {
				this.jInternalFrameReporteDinamicoTipoProforma=new ReporteDinamicoJInternalFrame(TipoProformaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoProforma);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoProforma);
				this.jInternalFrameReporteDinamicoTipoProforma.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoProforma.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoProforma.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoProforma"));
				this.jInternalFrameReporteDinamicoTipoProforma.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoProforma"));
				this.jInternalFrameReporteDinamicoTipoProforma.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoProforma"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoProforma();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaProforma() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jScrollPanelDatosProforma.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoProforma.jContentPaneDetalleTipoProforma.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jScrollPanelDatosProforma.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jScrollPanelDatosProforma.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.jScrollPanelDatosProforma.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoProforma() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoProforma);
			
	       	this.jInternalFrameDetalleFormTipoProforma.setVisible(false);
	        this.jInternalFrameDetalleFormTipoProforma.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoProforma.dispose();
			//this.jInternalFrameDetalleFormTipoProforma=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoProforma() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoProforma.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoProforma.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoProforma() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoProforma.setVisible(true);
	        this.jInternalFrameImportacionTipoProforma.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoProforma() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoProforma.setVisible(true);
	        this.jInternalFrameOrderByTipoProforma.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoProforma() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoProforma.setVisible(false);
	        this.jInternalFrameOrderByTipoProforma.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoProforma() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoProforma.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoProforma.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoProforma() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoProforma.setVisible(false);
	        this.jInternalFrameImportacionTipoProforma.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoProforma(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoProforma(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoProforma.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoProforma(true);
			//this.isEsNuevoTipoProforma=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproforma =(TipoProforma) this.tipoproformaLogic.getTipoProformas().toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoproforma =(TipoProforma) this.tipoproformas.toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoProforma("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoProforma(false) ;
			
			if(tipoproformaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.proformaSessionBean.getEsGuardarRelacionado() && ProformaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProformaActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoProformaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoProforma(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoProforma(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoProformaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoProforma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproforma =(TipoProforma) this.tipoproformaLogic.getTipoProformas().toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoproforma =(TipoProforma) this.tipoproformas.toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoProforma(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoProforma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoProforma.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoProforma(true);
			//this.isEsNuevoTipoProforma=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproforma =(TipoProforma) this.tipoproformaLogic.getTipoProformas().toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoproforma =(TipoProforma) this.tipoproformas.toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoproforma.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoProforma("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoProforma(false) ;
			
			if(TipoProformaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoProforma(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoProforma(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproformaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoProforma(false);
			
			//if(!this.isEsNuevoTipoProforma) {								
				int intSelectedRow = this.jTableDatosTipoProforma.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproforma =(TipoProforma) this.tipoproformaLogic.getTipoProformas().toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoproforma =(TipoProforma) this.tipoproformas.toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoProforma(this.tipoproforma,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProforma(this.tipoproforma);
				
			}
			
			if(this.permiteMantenimiento(this.tipoproforma)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoproformaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoProforma=true;
					this.inicializarActualizarBindingTablaTipoProforma(false);
					this.isEsNuevoTipoProforma=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoProforma=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoProforma=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoProforma(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoProforma(false);
				
				this.habilitarDeshabilitarControlesTipoProforma(false);
			
												
				
				if(TipoProformaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoProforma();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoProformaActionPerformed(evt,tipoproformaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoProforma(this.tipoproforma,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoProforma.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoproformaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproformaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoproforma.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoProforma.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProforma.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproformaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproformaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproformaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoProforma.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproforma =(TipoProforma) this.tipoproformaLogic.getTipoProformas().toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
				this.tipoproforma.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoproforma =(TipoProforma) this.tipoproformas.toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
				this.tipoproforma.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoproforma)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoproformaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoProformaModel) this.jTableDatosTipoProforma.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoProforma=true;
				this.inicializarActualizarBindingTablaTipoProforma(false);
				this.isEsNuevoTipoProforma=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoProforma(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoProforma(false);
				
				this.habilitarDeshabilitarControlesTipoProforma(false);
				
				
				
				if(TipoProformaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoProforma();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproformaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproformaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproformaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoProformaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoProforma.getRowCount()>=1) {
				jTableDatosTipoProforma.removeRowSelectionInterval(0, jTableDatosTipoProforma.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoProforma(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoProforma(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoProforma(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoProforma(false) ;
			
			this.isEsNuevoTipoProforma=false;
			
			if(TipoProformaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoProforma();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoProformaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproformaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoProforma(false);
				
				//SI ES MANUAL
				if(TipoProformaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoProforma();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproformaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproformaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproformaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoProformaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoProforma--;			
			//TipoProforma tipoproformaAux= new TipoProforma();			
			//tipoproformaAux.setId(this.iIdNuevoTipoProforma);
			
			if(this.jInternalFrameDetalleFormTipoProforma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoProforma();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoProforma(this.tipoproforma);
			
			this.tipoproforma.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoproformaLogic.getTipoProformas().add(this.tipoproformaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoproformas.add(this.tipoproformaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoProforma(false);
			
			this.jTableDatosTipoProforma.setRowSelectionInterval(this.getIndiceNuevoTipoProforma(), this.getIndiceNuevoTipoProforma());
			
			int iLastRow =  this.jTableDatosTipoProforma.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoProforma.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoProforma.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoProforma(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoProformaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproformaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoProforma(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoProforma(false);
			
			//SI ES MANUAL
			if(TipoProformaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoProforma();
			}
			
			//this.abrirFrameTreeTipoProforma();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproformaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproformaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproformaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoProformaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo ProformaS ?", "MANTENIMIENTO DE Tipo Proforma", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoProforma.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoProforma();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoproformaReturnGeneral=tipoproformaLogic.procesarImportacionTipoProformasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoproformaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoProformaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoProformaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoProforma.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoProforma.setFileImportacion(this.jInternalFrameImportacionTipoProforma.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoProforma.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoProforma.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoProforma.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoProforma.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoProformaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoProforma> tipoproformasSeleccionados=new ArrayList<TipoProforma>();		

		tipoproformasSeleccionados=this.getTipoProformasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoProforma.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoProforma.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoProformaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoProformaBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoProformas("Todos",tipoproformasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Proforma",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoProforma.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProforma.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoProformaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoProformaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoProformaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoProforma.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoProforma.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoProforma.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoProformaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoProformaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoProformaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoProforma.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoProformaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoProformaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoProformaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoProforma.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProforma.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoProformaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoProformaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoProformaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoProformaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoProforma> tipoproformasSeleccionados=new ArrayList<TipoProforma>();		
		
		tipoproformasSeleccionados=this.getTipoProformasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoproforma";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoProformas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoProforma.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProforma.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoProformaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoProformaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoProforma tipoproforma:tipoproformasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoproforma.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoProformaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoProformaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoProforma tipoproforma:tipoproformasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoproforma.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoProformaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoProformaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoProforma tipoproforma:tipoproformasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoproforma.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoProforma(row);				
			//	iRow++;
			//}				
			
			//for(TipoProforma tipoproformaAux:tipoproformasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoProforma(tipoproformaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Proforma",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoproformaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoProforma(false);
			
			//SI ES MANUAL
			if(TipoProformaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoProforma();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproformaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproformaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproformaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoProformaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproformaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoProforma(false);
			
			//SI ES MANUAL
			if(TipoProformaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoProforma();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproformaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproformaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproformaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoProformaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproformaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoProforma(false);
			
			//SI ES MANUAL
			if(TipoProformaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoProforma();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproformaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproformaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproformaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoProforma() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoProforma.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoProforma.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoProforma.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoProforma.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoProforma.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoProforma.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoProforma.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoProforma(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoProforma(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoProforma(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoProforma(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoProforma(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoproformaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoProforma(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoProforma(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoProforma(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoProformaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoProformaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoProforma() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoProforma();
		
		this.inicializarActualizarBindingBotonesManualTipoProforma(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoproformaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoProforma();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoProforma() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoProforma(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoProforma(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoProforma.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoProforma.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoProforma.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoProforma!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoProforma.jCheckBoxPostAccionNuevoTipoProforma.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoProforma.jCheckBoxPostAccionSinCerrarTipoProforma.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoProforma.jCheckBoxPostAccionSinMensajeTipoProforma.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoProforma.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoProforma.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoProforma.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoProforma!=null) {
				this.jInternalFrameDetalleFormTipoProforma.jCheckBoxPostAccionNuevoTipoProforma.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoProforma.jCheckBoxPostAccionSinCerrarTipoProforma.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoProforma.jCheckBoxPostAccionSinMensajeTipoProforma.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoProforma.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoProforma.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoProforma!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoProforma.jComboBoxTiposAccionesFormularioTipoProforma.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoProforma.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoProforma!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoProforma.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoProforma.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoProforma.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoProforma.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoProforma.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoProforma!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoProforma.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoProforma.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoProforma.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoProforma(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoProformaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoProforma(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoProforma() throws Exception {
		try	{
			if(TipoProformaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoProforma();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoProforma() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoProforma.jComboBoxTiposAccionesFormularioTipoProforma.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoProforma.jComboBoxTiposAccionesFormularioTipoProforma.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoProforma() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoProforma.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoProforma.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoProforma.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoProforma.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoProforma.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoProforma.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoProforma.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoProforma.addItem(reporte);
			}
			
			
			if(!this.tipoproformaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoProforma.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoProforma.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoProforma.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoProforma.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoProforma.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoProforma.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoProforma!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoProforma.jComboBoxTiposAccionesFormularioTipoProforma.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoProforma.jComboBoxTiposAccionesFormularioTipoProforma.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoProforma.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoProforma.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoProforma.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoProforma();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoProforma() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoProforma!=null) {
				this.jInternalFrameReporteDinamicoTipoProforma.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoProforma.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoProforma!=null) {
				this.jInternalFrameReporteDinamicoTipoProforma.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoProforma.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoProforma!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoProforma.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoProforma.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoProforma.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoProforma.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoProforma.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoProforma.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoProforma()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoProforma(Boolean esInicializar) throws Exception {				
		if(TipoProformaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoProforma();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoProforma() throws Exception {
		this.inicializarActualizarBindingTablaTipoProforma(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoProforma() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoProforma.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoProforma.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoProforma.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoProformaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoProforma.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoProforma.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoProformaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoProformaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProformaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoProformaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoProforma.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoProforma.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoProformaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoProforma.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoProforma(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoproformaLogic.getTipoProformas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoproformas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoProforma.setModel(new TipoProformaModel(this.tipoproformaLogic.getTipoProformas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoProforma.setModel(new TipoProformaModel(this.tipoproformas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoProforma!=null && this.jInternalFrameOrderByTipoProforma.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoProforma();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProforma,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoProformaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoProformaConstantesFunciones.SCLASSWEBTITULO,tipoproformaConstantesFunciones.resaltarSeleccionarTipoProforma,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoProformaConstantesFunciones.SCLASSWEBTITULO,tipoproformaConstantesFunciones.resaltarSeleccionarTipoProforma,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProforma,TipoProformaConstantesFunciones.LABEL_ID));

		if(this.tipoproformaConstantesFunciones.mostraridTipoProforma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoProformaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoproformaConstantesFunciones.resaltaridTipoProforma,this.tipoproformaConstantesFunciones.activaridTipoProforma,this,true,"idTipoProforma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoproformaConstantesFunciones.resaltaridTipoProforma,this.tipoproformaConstantesFunciones.activaridTipoProforma,this,true,"idTipoProforma","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProforma,TipoProformaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipoproformaConstantesFunciones.mostrarid_empresaTipoProforma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoProformaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipoproformaConstantesFunciones.resaltarid_empresaTipoProforma,this,this.tipoproformaConstantesFunciones.activarid_empresaTipoProforma));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipoproformaConstantesFunciones.resaltarid_empresaTipoProforma,this,this.tipoproformaConstantesFunciones.activarid_empresaTipoProforma,false,"id_empresaTipoProforma","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoProformaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProforma,TipoProformaConstantesFunciones.LABEL_CODIGO));

		if(this.tipoproformaConstantesFunciones.mostrarcodigoTipoProforma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoProformaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoproformaConstantesFunciones.resaltarcodigoTipoProforma,this.tipoproformaConstantesFunciones.activarcodigoTipoProforma,this,true,"codigoTipoProforma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoproformaConstantesFunciones.resaltarcodigoTipoProforma,this.tipoproformaConstantesFunciones.activarcodigoTipoProforma,this,true,"codigoTipoProforma","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoProformaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProforma,TipoProformaConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoproformaConstantesFunciones.mostrarnombreTipoProforma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoProformaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoproformaConstantesFunciones.resaltarnombreTipoProforma,this.tipoproformaConstantesFunciones.activarnombreTipoProforma,this,true,"nombreTipoProforma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoproformaConstantesFunciones.resaltarnombreTipoProforma,this.tipoproformaConstantesFunciones.activarnombreTipoProforma,this,true,"nombreTipoProforma","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoProformaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoproformaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosProforma && this.tipoproformaConstantesFunciones.mostrarProformaTipoProforma && !TipoProformaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Proformas");
				tableColumn.setHeaderValue("Proformas");
				tableColumn.setCellRenderer(new ProformaTableCell(tipoproformaConstantesFunciones.resaltarProformaTipoProforma,this,this.tipoproformaConstantesFunciones.activarProformaTipoProforma));
				tableColumn.setCellEditor(new ProformaTableCell(tipoproformaConstantesFunciones.resaltarProformaTipoProforma,this,this.tipoproformaConstantesFunciones.activarProformaTipoProforma));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoProforma.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoproformaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoproformaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoProforma.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoproformaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoproformaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoProforma.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoProforma && this.isPermisoGuardarCambiosTipoProforma) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoproformaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoproformaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoProforma.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipoproformaSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoProforma.addColumn(tableColumn);
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
			
			this.jTableDatosTipoProforma.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoProforma && this.isPermisoGuardarCambiosTipoProforma) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoproformaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoProforma && this.isPermisoGuardarCambiosTipoProforma) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoProforma.moveColumn(this.jTableDatosTipoProforma.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoProforma.moveColumn(this.jTableDatosTipoProforma.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoproformaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoProforma.moveColumn(this.jTableDatosTipoProforma.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoProforma.moveColumn(this.jTableDatosTipoProforma.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoProforma.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoProforma.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoProforma,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoProforma.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoProforma.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoProforma.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoProforma.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoProforma.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoproformaLogic.getTipoProformas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoproformas.size()-1;
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
		//this.jTableDatosTipoProforma.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoProforma();
			
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
				
				//this.isEsNuevoTipoProforma=false;
					
				TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
			
				if(this.tipoproformaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoProforma==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoProforma.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoProforma.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproforma =(TipoProforma) this.tipoproformaLogic.getTipoProformas().toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoproforma =(TipoProforma) this.tipoproformas.toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoproforma.getsType().equals("DUPLICADO")
				   || this.tipoproforma.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoProforma=true;
				
				} else {
					this.isEsNuevoTipoProforma=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoproformaSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoproforma.getId()>=0 && !this.tipoproforma.getIsNew()) {						
						this.isEsNuevoTipoProforma=false;
						
					} else {
						this.isEsNuevoTipoProforma=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoProforma(esRelaciones);						
				
				this.seleccionarTipoProforma(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoproforma.getId()<0) {
					this.isEsNuevoTipoProforma=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoProforma(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoProforma(evt,rowIndex);
				}	
				
				if(this.tipoproformaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoProforma: " + this.dDif); 
					}
				}								
				
				TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoProforma(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoproforma)) {
					if(this.tipoproforma.getId()>0) {
						this.tipoproforma.setIsDeleted(true);
						
						this.tipoproformasEliminados.add(this.tipoproforma);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoproformaLogic.getTipoProformas().remove(this.tipoproforma);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoproformas.remove(this.tipoproforma);				
					}
					
					
					((TipoProformaModel) this.jTableDatosTipoProforma.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoProforma(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoProforma(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoProforma) {
			
			if(this.jInternalFrameDetalleFormTipoProforma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoProforma.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoProforma.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproforma =(TipoProforma) this.tipoproformaLogic.getTipoProformas().toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoproforma =(TipoProforma) this.tipoproformas.toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoProforma(this.tipoproforma);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipoproformaConstantesFunciones.cargarid_empresaTipoProforma || this.tipoproformaConstantesFunciones.event_dependid_empresaTipoProforma) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipoproforma.getid_empresa());
									//this.inicializarActualizarBindingTipoProforma(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipoproforma.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipoproforma.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipoproforma.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoProforma("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoProforma(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoProforma() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoProforma(TipoProforma tipoproforma) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoProforma(tipoproforma,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoProforma(TipoProforma tipoproforma,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoProforma(tipoproforma);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoProforma(tipoproforma,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoProforma(tipoproforma);
	}
	
	public void setVariablesObjetoActualToFormularioTipoProforma(TipoProforma tipoproforma) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoProforma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoProforma.jLabelidTipoProforma.setText(tipoproforma.getId().toString());
			this.jInternalFrameDetalleFormTipoProforma.jTextFieldcodigoTipoProforma.setText(tipoproforma.getcodigo());
			this.jInternalFrameDetalleFormTipoProforma.jTextAreanombreTipoProforma.setText(tipoproforma.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoProforma tipoproformaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoproformaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoProforma tipoproformaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoproformaLocal=this.tipoproforma;
			} else {
				tipoproformaLocal=this.tipoproformaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoproformaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoProforma(tipoproformaLocal,true);
					
					if(tipoproformaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoproformaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoproformaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoproformaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoProforma(TipoProforma tipoproforma,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoProforma(tipoproforma,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoProforma(tipoproforma);
	}
	
	public void setVariablesFormularioToObjetoActualTipoProforma(TipoProforma tipoproforma,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoProforma(tipoproforma,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoProforma(TipoProforma tipoproforma,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoProforma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoProforma.jLabelidTipoProforma.getText()==null || this.jInternalFrameDetalleFormTipoProforma.jLabelidTipoProforma.getText()=="" || this.jInternalFrameDetalleFormTipoProforma.jLabelidTipoProforma.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoProforma.jLabelidTipoProforma.setText("0");
			}

			if(conColumnasBase) {tipoproforma.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoProforma.jLabelidTipoProforma.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoProformaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProforma.jLabelIdTipoProforma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoproforma.setcodigo(this.jInternalFrameDetalleFormTipoProforma.jTextFieldcodigoTipoProforma.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoProformaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProforma.jLabelcodigoTipoProforma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoproforma.setnombre(this.jInternalFrameDetalleFormTipoProforma.jTextAreanombreTipoProforma.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoProformaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProforma.jLabelnombreTipoProforma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoProforma(TipoProforma tipoproformaBean,TipoProforma tipoproforma,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoProforma(TipoProforma tipoproformaOrigen,TipoProforma tipoproforma,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoproformaOrigen.getId()!=null && !tipoproformaOrigen.getId().equals(0L))) {tipoproforma.setId(tipoproformaOrigen.getId());}}
			if(conDefault || (!conDefault && tipoproformaOrigen.getcodigo()!=null && !tipoproformaOrigen.getcodigo().equals(""))) {tipoproforma.setcodigo(tipoproformaOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipoproformaOrigen.getnombre()!=null && !tipoproformaOrigen.getnombre().equals(""))) {tipoproforma.setnombre(tipoproformaOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoProforma(TipoProforma tipoproforma) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoProforma.jLabelidTipoProforma.setText(tipoproforma.getId().toString());
			this.jInternalFrameDetalleFormTipoProforma.jTextFieldcodigoTipoProforma.setText(tipoproforma.getcodigo());
			this.jInternalFrameDetalleFormTipoProforma.jTextAreanombreTipoProforma.setText(tipoproforma.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoProforma(TipoProformaBean tipoproformaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoProforma.jLabelidTipoProforma.setText(tipoproformaBean.getId().toString());
			this.jInternalFrameDetalleFormTipoProforma.jTextFieldcodigoTipoProforma.setText(tipoproformaBean.getcodigo());
			this.jInternalFrameDetalleFormTipoProforma.jTextAreanombreTipoProforma.setText(tipoproformaBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoProforma(TipoProformaParameterReturnGeneral tipoproformaReturnGeneral,TipoProformaBean tipoproformaBean,Boolean conDefault) throws Exception { 
		try {
			TipoProforma tipoproformaLocal=new TipoProforma();
			
			tipoproformaLocal=tipoproformaReturnGeneral.getTipoProforma();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoproformaLocal.getId()!=null && !tipoproformaLocal.getId().equals(0L))) {tipoproformaBean.setId(tipoproformaLocal.getId());}}
			if(conDefault || (!conDefault && tipoproformaLocal.getcodigo()!=null && !tipoproformaLocal.getcodigo().equals(""))) {tipoproformaBean.setcodigo(tipoproformaLocal.getcodigo());}
			if(conDefault || (!conDefault && tipoproformaLocal.getnombre()!=null && !tipoproformaLocal.getnombre().equals(""))) {tipoproformaBean.setnombre(tipoproformaLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoProformaGenerico(Long idTipoProformaSeleccionado,JComboBox jComboBoxTipoProforma,List<TipoProforma> tipoproformasLocal)throws Exception {
		try {
			TipoProforma  tipoproformaTemp=null;

			for(TipoProforma tipoproformaAux:tipoproformasLocal) {
				if(tipoproformaAux.getId()!=null && tipoproformaAux.getId().equals(idTipoProformaSeleccionado)) {
					tipoproformaTemp=tipoproformaAux;
					break;
				}
			}

			jComboBoxTipoProforma.setSelectedItem(tipoproformaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoProformaGenerico(JComboBox jComboBoxTipoProforma,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoProforma.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoProforma.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoProforma.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoProforma.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Proforma")) {
			jButtonProformaActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoproforma=(TipoProforma) tipoproformaLogic.getTipoProformas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoproforma =(TipoProforma) tipoproformas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipoproforma.getIsNew() && !tipoproforma.getIsChanged() && !tipoproforma.getIsDeleted()) {
				sDescripcion=tipoproforma.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipoproforma.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoProforma tipoproformaRow=new TipoProforma();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoproformaRow=(TipoProforma) tipoproformaLogic.getTipoProformas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoproformaRow=(TipoProforma) tipoproformas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonProformaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoProforma tipoproforma) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoProforma==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproformaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoproforma = (TipoProforma)this.tipoproformaLogic.getTipoProformas().toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoproforma = (TipoProforma)this.tipoproformas.toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoproforma!=null) {
						this.tipoproforma = tipoproforma;
					} else {
						this.tipoproforma = new TipoProforma();
					}
				}

				if(this.isTienePermisosProforma && this.permiteMantenimiento(this.tipoproforma)) {
					ProformaBeanSwingJInternalFrame proformaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFramePopup=new ProformaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						proformaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFramePopup;
					} else {
						proformaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame;
					}

					List<TipoProforma> tipoproformas=new ArrayList<TipoProforma>();
					tipoproformas.add(this.tipoproforma);
					if(!esRelacionado) {
						//proformaBeanSwingJInternalFrame.proformaSessionBean.setConGuardarRelaciones(false);
						//proformaBeanSwingJInternalFrame.proformaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					proformaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoProforma.cargarProformaBeanSwingJInternalFrame(tipoproformas,this.tipoproforma,proformaBeanSwingJInternalFrame,/*conInicializar,*/proformaBeanSwingJInternalFrame.proformaSessionBean.getConGuardarRelaciones(),proformaBeanSwingJInternalFrame.proformaSessionBean.getEsGuardarRelacionado());
					proformaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						proformaBeanSwingJInternalFrame.actualizarEstadoPanelsProforma("no_relacionado");

						proformaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ProformaConstantesFunciones.ITAMANIOFILATABLA + (ProformaConstantesFunciones.ITAMANIOFILATABLA/2));

						proformaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoProforma=(TitledBorder)this.jScrollPanelDatosTipoProforma.getBorder();
						TitledBorder titledBorderProforma=(TitledBorder)proformaBeanSwingJInternalFrame.jScrollPanelDatosProforma.getBorder();

						titledBorderProforma.setTitle(titledBorderTipoProforma.getTitle() + " -> Proforma");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,proformaBeanSwingJInternalFrame);
						}

						proformaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(proformaBeanSwingJInternalFrame);

						proformaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoproformaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Proforma",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproformaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproformaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproformaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoProforma(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoProforma.setVisible((this.isVisibilidadCeldaNuevoTipoProforma && this.isPermisoNuevoTipoProforma));			
			this.jButtonDuplicarTipoProforma.setVisible((this.isVisibilidadCeldaDuplicarTipoProforma && this.isPermisoDuplicarTipoProforma));			
			this.jButtonCopiarTipoProforma.setVisible((this.isVisibilidadCeldaCopiarTipoProforma && this.isPermisoCopiarTipoProforma));
			this.jButtonVerFormTipoProforma.setVisible((this.isVisibilidadCeldaVerFormTipoProforma && this.isPermisoVerFormTipoProforma));
			
			this.jButtonAbrirOrderByTipoProforma.setVisible((this.isVisibilidadCeldaOrdenTipoProforma && this.isPermisoOrdenTipoProforma));			
			
			this.jButtonNuevoRelacionesTipoProforma.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoProforma && this.isPermisoNuevoTipoProforma));			
			this.jButtonNuevoGuardarCambiosTipoProforma.setVisible((this.isVisibilidadCeldaNuevoTipoProforma && this.isPermisoNuevoTipoProforma && this.isPermisoGuardarCambiosTipoProforma));
			
			if(this.jInternalFrameDetalleFormTipoProforma!=null) {
			this.jInternalFrameDetalleFormTipoProforma.jButtonModificarTipoProforma.setVisible((this.isVisibilidadCeldaModificarTipoProforma && this.isPermisoActualizarTipoProforma));	
			this.jInternalFrameDetalleFormTipoProforma.jButtonActualizarTipoProforma.setVisible((this.isVisibilidadCeldaActualizarTipoProforma && this.isPermisoActualizarTipoProforma));	
			this.jInternalFrameDetalleFormTipoProforma.jButtonEliminarTipoProforma.setVisible((this.isVisibilidadCeldaEliminarTipoProforma && this.isPermisoEliminarTipoProforma));
			this.jInternalFrameDetalleFormTipoProforma.jButtonCancelarTipoProforma.setVisible(this.isVisibilidadCeldaCancelarTipoProforma);							
			this.jInternalFrameDetalleFormTipoProforma.jButtonGuardarCambiosTipoProforma.setVisible((this.isVisibilidadCeldaGuardarTipoProforma && this.isPermisoGuardarCambiosTipoProforma));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoProforma.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoProforma && this.isPermisoGuardarCambiosTipoProforma));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoProforma.setVisible((this.isVisibilidadCeldaNuevoTipoProforma && this.isPermisoNuevoTipoProforma));						
			this.jButtonDuplicarToolBarTipoProforma.setVisible((this.isVisibilidadCeldaDuplicarTipoProforma && this.isPermisoDuplicarTipoProforma));						
			this.jButtonCopiarToolBarTipoProforma.setVisible((this.isVisibilidadCeldaCopiarTipoProforma && this.isPermisoCopiarTipoProforma));			
			this.jButtonVerFormToolBarTipoProforma.setVisible((this.isVisibilidadCeldaVerFormTipoProforma && this.isPermisoVerFormTipoProforma));			
			this.jButtonAbrirOrderByToolBarTipoProforma.setVisible((this.isVisibilidadCeldaOrdenTipoProforma && this.isPermisoOrdenTipoProforma));
			this.jButtonNuevoRelacionesToolBarTipoProforma.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoProforma && this.isPermisoNuevoTipoProforma));			
			this.jButtonNuevoGuardarCambiosToolBarTipoProforma.setVisible((this.isVisibilidadCeldaNuevoTipoProforma && this.isPermisoNuevoTipoProforma && this.isPermisoGuardarCambiosTipoProforma));			
			
			if(this.jInternalFrameDetalleFormTipoProforma!=null) {
			this.jInternalFrameDetalleFormTipoProforma.jButtonModificarToolBarTipoProforma.setVisible((this.isVisibilidadCeldaModificarTipoProforma && this.isPermisoActualizarTipoProforma));	
			this.jInternalFrameDetalleFormTipoProforma.jButtonActualizarToolBarTipoProforma.setVisible((this.isVisibilidadCeldaActualizarTipoProforma  && this.isPermisoActualizarTipoProforma));	
			this.jInternalFrameDetalleFormTipoProforma.jButtonEliminarToolBarTipoProforma.setVisible((this.isVisibilidadCeldaEliminarTipoProforma && this.isPermisoEliminarTipoProforma));
			this.jInternalFrameDetalleFormTipoProforma.jButtonCancelarToolBarTipoProforma.setVisible(this.isVisibilidadCeldaCancelarTipoProforma);				
			this.jInternalFrameDetalleFormTipoProforma.jButtonGuardarCambiosToolBarTipoProforma.setVisible((this.isVisibilidadCeldaGuardarTipoProforma && this.isPermisoGuardarCambiosTipoProforma));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoProforma.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoProforma && this.isPermisoGuardarCambiosTipoProforma));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoProforma.setVisible((this.isVisibilidadCeldaNuevoTipoProforma && this.isPermisoNuevoTipoProforma));			
			this.jMenuItemDuplicarTipoProforma.setVisible((this.isVisibilidadCeldaDuplicarTipoProforma && this.isPermisoDuplicarTipoProforma));			
			this.jMenuItemCopiarTipoProforma.setVisible((this.isVisibilidadCeldaCopiarTipoProforma && this.isPermisoCopiarTipoProforma));			
			this.jMenuItemVerFormTipoProforma.setVisible((this.isVisibilidadCeldaVerFormTipoProforma && this.isPermisoVerFormTipoProforma));			
			this.jMenuItemAbrirOrderByTipoProforma.setVisible((this.isVisibilidadCeldaOrdenTipoProforma && this.isPermisoOrdenTipoProforma));			
			//this.jMenuItemMostrarOcultarTipoProforma.setVisible((this.isVisibilidadCeldaOrdenTipoProforma && this.isPermisoOrdenTipoProforma));
			this.jMenuItemDetalleAbrirOrderByTipoProforma.setVisible((this.isVisibilidadCeldaOrdenTipoProforma && this.isPermisoOrdenTipoProforma));			
			//this.jMenuItemDetalleMostrarOcultarTipoProforma.setVisible((this.isVisibilidadCeldaOrdenTipoProforma && this.isPermisoOrdenTipoProforma));			
			this.jMenuItemNuevoRelacionesTipoProforma.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoProforma && this.isPermisoNuevoTipoProforma));			
			this.jMenuItemNuevoGuardarCambiosTipoProforma.setVisible((this.isVisibilidadCeldaNuevoTipoProforma && this.isPermisoNuevoTipoProforma && this.isPermisoGuardarCambiosTipoProforma));									
			
			if(this.jInternalFrameDetalleFormTipoProforma!=null) {
			this.jInternalFrameDetalleFormTipoProforma.jMenuItemModificarTipoProforma.setVisible((this.isVisibilidadCeldaModificarTipoProforma && this.isPermisoActualizarTipoProforma));	
			this.jInternalFrameDetalleFormTipoProforma.jMenuItemActualizarTipoProforma.setVisible((this.isVisibilidadCeldaActualizarTipoProforma && this.isPermisoActualizarTipoProforma));	
			this.jInternalFrameDetalleFormTipoProforma.jMenuItemEliminarTipoProforma.setVisible((this.isVisibilidadCeldaEliminarTipoProforma && this.isPermisoEliminarTipoProforma));
			this.jInternalFrameDetalleFormTipoProforma.jMenuItemCancelarTipoProforma.setVisible(this.isVisibilidadCeldaCancelarTipoProforma);				
			}
			
			this.jMenuItemGuardarCambiosTipoProforma.setVisible((this.isVisibilidadCeldaGuardarTipoProforma && this.isPermisoGuardarCambiosTipoProforma));						
			this.jMenuItemGuardarCambiosTablaTipoProforma.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoProforma && this.isPermisoGuardarCambiosTipoProforma));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoProforma=this.jButtonNuevoTipoProforma.isVisible();
			this.isVisibilidadCeldaDuplicarTipoProforma=this.jButtonDuplicarTipoProforma.isVisible();
			this.isVisibilidadCeldaCopiarTipoProforma=this.jButtonCopiarTipoProforma.isVisible();
			this.isVisibilidadCeldaVerFormTipoProforma=this.jButtonVerFormTipoProforma.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoProforma=this.jButtonAbrirOrderByTipoProforma.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoProforma=this.jButtonNuevoRelacionesTipoProforma.isVisible();
			this.isVisibilidadCeldaModificarTipoProforma=this.jButtonModificarTipoProforma.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoProforma!=null) {
			this.isVisibilidadCeldaActualizarTipoProforma=this.jInternalFrameDetalleFormTipoProforma.jButtonActualizarTipoProforma.isVisible();
			this.isVisibilidadCeldaEliminarTipoProforma=this.jInternalFrameDetalleFormTipoProforma.jButtonEliminarTipoProforma.isVisible();
			this.isVisibilidadCeldaCancelarTipoProforma=this.jInternalFrameDetalleFormTipoProforma.jButtonCancelarTipoProforma.isVisible();
			this.isVisibilidadCeldaGuardarTipoProforma=this.jInternalFrameDetalleFormTipoProforma.jButtonGuardarCambiosTipoProforma.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoProforma=this.jButtonGuardarCambiosTablaTipoProforma.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoProforma=this.jButtonNuevoToolBarTipoProforma.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoProforma=this.jButtonNuevoRelacionesToolBarTipoProforma.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoProforma!=null) {
			this.isVisibilidadCeldaModificarTipoProforma=this.jInternalFrameDetalleFormTipoProforma.jButtonModificarToolBarTipoProforma.isVisible();
			this.isVisibilidadCeldaActualizarTipoProforma=this.jInternalFrameDetalleFormTipoProforma.jButtonActualizarToolBarTipoProforma.isVisible();
			this.isVisibilidadCeldaEliminarTipoProforma=this.jInternalFrameDetalleFormTipoProforma.jButtonEliminarToolBarTipoProforma.isVisible();
			this.isVisibilidadCeldaCancelarTipoProforma=this.jInternalFrameDetalleFormTipoProforma.jButtonCancelarToolBarTipoProforma.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoProforma=this.jButtonGuardarCambiosToolBarTipoProforma.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoProforma=this.jButtonGuardarCambiosTablaToolBarTipoProforma.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoProforma=this.jMenuItemNuevoTipoProforma.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoProforma=this.jMenuItemNuevoRelacionesTipoProforma.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoProforma!=null) {
			this.isVisibilidadCeldaModificarTipoProforma=this.jInternalFrameDetalleFormTipoProforma.jMenuItemModificarTipoProforma.isVisible();
			this.isVisibilidadCeldaActualizarTipoProforma=this.jInternalFrameDetalleFormTipoProforma.jMenuItemActualizarTipoProforma.isVisible();
			this.isVisibilidadCeldaEliminarTipoProforma=this.jInternalFrameDetalleFormTipoProforma.jMenuItemEliminarTipoProforma.isVisible();
			this.isVisibilidadCeldaCancelarTipoProforma=this.jInternalFrameDetalleFormTipoProforma.jMenuItemCancelarTipoProforma.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoProforma=this.jMenuItemGuardarCambiosTipoProforma.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoProforma=this.jMenuItemGuardarCambiosTablaTipoProforma.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoProforma(Boolean esInicializar) {
		if(TipoProformaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoproformaSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoproformaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoProforma();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoProforma(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoProforma() {
		this.jButtonNuevoTipoProforma.setVisible(this.isPermisoNuevoTipoProforma);			
		this.jButtonDuplicarTipoProforma.setVisible(this.isPermisoDuplicarTipoProforma);			
		this.jButtonCopiarTipoProforma.setVisible(this.isPermisoCopiarTipoProforma);			
		this.jButtonVerFormTipoProforma.setVisible(this.isPermisoVerFormTipoProforma);			
		
		this.jButtonAbrirOrderByTipoProforma.setVisible(this.isPermisoOrdenTipoProforma);					
		
		this.jButtonNuevoRelacionesTipoProforma.setVisible(this.isPermisoNuevoTipoProforma);			
		
		if(this.jInternalFrameDetalleFormTipoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProforma.jButtonModificarTipoProforma.setVisible(this.isPermisoActualizarTipoProforma);	
			this.jInternalFrameDetalleFormTipoProforma.jButtonActualizarTipoProforma.setVisible(this.isPermisoActualizarTipoProforma);	
			this.jInternalFrameDetalleFormTipoProforma.jButtonEliminarTipoProforma.setVisible(this.isPermisoEliminarTipoProforma);
			this.jInternalFrameDetalleFormTipoProforma.jButtonCancelarTipoProforma.setVisible(this.isVisibilidadCeldaCancelarTipoProforma);						
			this.jInternalFrameDetalleFormTipoProforma.jButtonGuardarCambiosTipoProforma.setVisible(this.isPermisoGuardarCambiosTipoProforma);							
		}
		
		this.jButtonGuardarCambiosTablaTipoProforma.setVisible(this.isPermisoActualizarTipoProforma);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoProforma() {
		this.jInternalFrameDetalleFormTipoProforma.jButtonModificarTipoProforma.setVisible(this.isPermisoActualizarTipoProforma);	
		this.jInternalFrameDetalleFormTipoProforma.jButtonActualizarTipoProforma.setVisible(this.isPermisoActualizarTipoProforma);	
		this.jInternalFrameDetalleFormTipoProforma.jButtonEliminarTipoProforma.setVisible(this.isPermisoEliminarTipoProforma);
		this.jInternalFrameDetalleFormTipoProforma.jButtonCancelarTipoProforma.setVisible(this.isVisibilidadCeldaCancelarTipoProforma);							
		this.jInternalFrameDetalleFormTipoProforma.jButtonGuardarCambiosTipoProforma.setVisible((this.isVisibilidadCeldaGuardarTipoProforma && this.isPermisoGuardarCambiosTipoProforma));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoProforma() {
		if(TipoProformaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoProforma();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoProforma() {
	}
	
	public void jTableDatosTipoProformaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoProforma(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoProformaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproformaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoProforma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoProforma(this.gettipoproforma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProforma(this.tipoproforma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoproforma =(TipoProforma) this.tipoproformaLogic.getTipoProformas().toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoproforma =(TipoProforma) this.tipoproformas.toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoproforma==null) {
						this.tipoproforma = new TipoProforma();
					}

					this.setVariablesFormularioToObjetoActualTipoProforma(this.tipoproforma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProforma(this.tipoproforma);
				}

				if(this.tipoproforma.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoproforma.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoProforma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproformaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproformaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproformaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoProformaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproformaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoProforma(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoProforma.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoProforma.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoProforma.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproforma =(TipoProforma) this.tipoproformaLogic.getTipoProformas().toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoproforma =(TipoProforma) this.tipoproformas.toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoProforma(this.gettipoproforma(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProforma(this.tipoproforma);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipoproformaLogic.getConnexion());

				if(this.tipoproforma.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipoproforma.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoProforma=(TitledBorder)this.jScrollPanelDatosTipoProforma.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoProforma.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproformaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproformaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproformaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoProformaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproformaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoProforma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoProforma(this.gettipoproforma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProforma(this.tipoproforma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoproforma =(TipoProforma) this.tipoproformaLogic.getTipoProformas().toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoproforma =(TipoProforma) this.tipoproformas.toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoproforma==null) {
						this.tipoproforma = new TipoProforma();
					}

					this.setVariablesFormularioToObjetoActualTipoProforma(this.tipoproforma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProforma(this.tipoproforma);
				}

				if(this.tipoproforma.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipoproforma.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoProforma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproformaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproformaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproformaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoProformaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproformaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoProforma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoProforma(this.gettipoproforma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProforma(this.tipoproforma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoproforma =(TipoProforma) this.tipoproformaLogic.getTipoProformas().toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoproforma =(TipoProforma) this.tipoproformas.toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoproforma==null) {
						this.tipoproforma = new TipoProforma();
					}

					this.setVariablesFormularioToObjetoActualTipoProforma(this.tipoproforma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProforma(this.tipoproforma);
				}

				if(this.tipoproforma.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipoproforma.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoProforma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproformaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproformaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproformaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoProformaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproformaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoProforma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoProforma(this.gettipoproforma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProforma(this.tipoproforma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoproforma =(TipoProforma) this.tipoproformaLogic.getTipoProformas().toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoproforma =(TipoProforma) this.tipoproformas.toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoproforma==null) {
						this.tipoproforma = new TipoProforma();
					}

					this.setVariablesFormularioToObjetoActualTipoProforma(this.tipoproforma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProforma(this.tipoproforma);
				}

				if(this.tipoproforma.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoproforma.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoProforma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproformaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproformaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproformaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoProformaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproformaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoProforma(false,false);

			this.getTipoProformasFK_IdEmpresa();

			this.inicializarActualizarBindingTipoProforma(false);

			//if(TipoProformaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoProforma(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproformaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproformaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoproformaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoProforma() {
		if(this.jInternalFrameDetalleFormTipoProforma!=null) {
		

		if(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoProforma!=null) {
			this.jInternalFrameDetalleFormTipoProforma.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoProforma.dispose();
			this.jInternalFrameDetalleFormTipoProforma=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoProforma!=null) {
			this.jInternalFrameReporteDinamicoTipoProforma.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoProforma.dispose();
			this.jInternalFrameReporteDinamicoTipoProforma=null;
		}
		
		if(this.jInternalFrameImportacionTipoProforma!=null) {
			this.jInternalFrameImportacionTipoProforma.setVisible(false);	    			
			this.jInternalFrameImportacionTipoProforma.dispose();
			this.jInternalFrameImportacionTipoProforma=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoProforma();
			
			TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoProforma")) {
				jButtonNuevoTipoProformaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoProforma")) {
				jButtonDuplicarTipoProformaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoProforma")) {
				jButtonCopiarTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoProforma")) {
				jButtonVerFormTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoProforma")) {
				jButtonNuevoTipoProformaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoProforma")) {
				jButtonDuplicarTipoProformaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoProforma")) {
				jButtonNuevoTipoProformaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoProforma")) {
				jButtonDuplicarTipoProformaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoProforma")) {
				jButtonNuevoTipoProformaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoProforma")) {
				jButtonNuevoTipoProformaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoProforma")) {
				jButtonNuevoTipoProformaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoProforma")) {
				jButtonModificarTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoProforma")) {
				jButtonModificarTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoProforma")) {
				jButtonModificarTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoProforma")) {
				jButtonActualizarTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoProforma")) {
				jButtonActualizarTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoProforma")) {
				jButtonActualizarTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoProforma")) {
				jButtonEliminarTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoProforma")) {
				jButtonEliminarTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoProforma")) {
				jButtonEliminarTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoProforma")) {
				jButtonCancelarTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoProforma")) {
				jButtonCancelarTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoProforma")) {
				jButtonCancelarTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoProforma")) {
				jButtonCerrarTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoProforma")) {
				jButtonCerrarTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoProforma")) {
				jButtonCerrarTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoProforma")) {
				jButtonMostrarOcultarTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoProforma")) {
				jButtonCancelarTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoProforma")) {
				jButtonGuardarCambiosTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoProforma")) {
				jButtonGuardarCambiosTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoProforma")) {
				jButtonCopiarTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoProforma")) {
				jButtonVerFormTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoProforma")) {
				jButtonGuardarCambiosTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoProforma")) {
				jButtonCopiarTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoProforma")) {
				jButtonVerFormTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoProforma")) {
				jButtonGuardarCambiosTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoProforma")) {
				jButtonGuardarCambiosTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoProforma")) {
				jButtonGuardarCambiosTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoProforma")) {
				jButtonRecargarInformacionTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoProforma")) {
				jButtonRecargarInformacionTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoProforma")) {
				jButtonRecargarInformacionTipoProformaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoProforma")) {
				jButtonAnterioresTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoProforma")) {
				jButtonAnterioresTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoProforma")) {
				jButtonAnterioresTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoProforma")) {
				jButtonSiguientesTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoProforma")) {
				jButtonSiguientesTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoProforma")) {
				jButtonSiguientesTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoProforma") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoProforma")) {
				jButtonAbrirOrderByTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoProforma") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoProforma")) {
				jButtonMostrarOcultarTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoProforma")) {
				jButtonNuevoGuardarCambiosTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoProforma")) {
				jButtonNuevoGuardarCambiosTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoProforma")) {
				jButtonNuevoGuardarCambiosTipoProformaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoProforma")) {
				jButtonCerrarReporteDinamicoTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoProforma")) {
				jButtonGenerarReporteDinamicoTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoProforma")) {
				
				jButtonGenerarExcelReporteDinamicoTipoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoProforma")) {
				jButtonCerrarImportacionTipoProformaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoProforma")) {
				
				jButtonGenerarImportacionTipoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoProforma")) {
				
				jButtonAbrirImportacionTipoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoProforma")) {
				jComboBoxTiposAccionesTipoProformaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoProforma")) {
				jComboBoxTiposRelacionesTipoProformaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoProforma")) {
				jComboBoxTiposAccionesTipoProformaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoProforma")) {
				
				jComboBoxTiposSeleccionarTipoProformaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoProforma")) {
				jTextFieldValorCampoGeneralTipoProformaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoProforma")) {
				jButtonAbrirOrderByTipoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoProforma")) {
				jButtonAbrirOrderByTipoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoProforma")) {
				jButtonCerrarOrderByTipoProformaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoProformaBusqueda")) {
				this.jButtonidTipoProformaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoProformaUpdate")) {
				this.jButtonid_empresaTipoProformaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoProformaBusqueda")) {
				this.jButtonid_empresaTipoProformaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoProformaBusqueda")) {
				this.jButtoncodigoTipoProformaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoProformaBusqueda")) {
				this.jButtonnombreTipoProformaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoProforma();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProformaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproforma);
				
				TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
				
				


				
				TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProforma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProforma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoProforma tipoproformaLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoproformaLocal=this.tipoproforma;
			} else {
				tipoproformaLocal=this.tipoproformaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproforma);
				
				TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
							
				
				


				
				TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProforma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProforma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProformaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProforma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproformaAnterior =(TipoProforma) this.tipoproformaLogic.getTipoProformas().toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoproformaAnterior =(TipoProforma) this.tipoproformas.toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
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
			
			TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
			
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
			
			


			
			TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProformaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproforma);
				
				TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
								
						
				


				
				TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProforma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProforma.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproforma);
				
				TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
								
				
				


				
				TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProforma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProforma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProformaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProforma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproformaAnterior =(TipoProforma) this.tipoproformaLogic.getTipoProformas().toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoproformaAnterior =(TipoProforma) this.tipoproformas.toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproforma);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProformaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProforma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproformaAnterior =(TipoProforma) this.tipoproformaLogic.getTipoProformas().toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoproformaAnterior =(TipoProforma) this.tipoproformas.toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProformaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproforma);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoproforma);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproforma);
				
				TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
							
				
				


				
				TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProforma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProforma.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProformaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoProforma.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoproformaAnterior =(TipoProforma) this.tipoproformaLogic.getTipoProformas().toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoproformaAnterior =(TipoProforma) this.tipoproformas.toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
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
			
			TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
			
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
			
			


			
			TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProformaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproforma);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoproforma);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproforma);
				
				TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
								
				
				


				
				TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProforma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProforma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProformaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProforma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproformaAnterior =(TipoProforma) this.tipoproformaLogic.getTipoProformas().toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoproformaAnterior =(TipoProforma) this.tipoproformas.toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProformaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproforma);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoproforma);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProformaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproforma);
				
				TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoProforma")) {
					jCheckBoxSeleccionarTodosTipoProformaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoProforma")) {
					jCheckBoxSeleccionadosTipoProformaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoProforma")) {
					
				}
				
				


				
				
				TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProforma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProforma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproforma);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoproforma);
				
				TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
												
				
				


				
				
				TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProforma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProforma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProformaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoProforma.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoproformaAnterior =(TipoProforma) this.tipoproformaLogic.getTipoProformas().toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoproformaAnterior =(TipoProforma) this.tipoproformas.toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProformaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproforma);
				
				TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
				
				
				TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
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
			
			TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
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
			
			


			
			TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProformaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproforma);
				
				TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProforma.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProforma.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoproforma);
				
				TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
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
				
				


				
				TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProforma.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProforma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProformaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProforma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoproformaAnterior =(TipoProforma) this.tipoproformaLogic.getTipoProformas().toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoproformaAnterior =(TipoProforma) this.tipoproformas.toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoProforma")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoProformaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoProforma.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoproforma =(TipoProforma) this.tipoproformaLogic.getTipoProformas().toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoproforma =(TipoProforma) this.tipoproformas.toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoproforma);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoProforma")) {
				
				}
				
				TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoProforma")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoProforma.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoProforma")) {
			
			}
			
			TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoProforma();
			
			TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
			
			if(sTipo.equals("NuevoTipoProforma")) {
				jButtonNuevoTipoProformaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoProforma")) {
				jButtonDuplicarTipoProformaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoProforma")) {
				jButtonCopiarTipoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoProforma")) {
				jButtonVerFormTipoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoProforma")) {
				jButtonNuevoTipoProformaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoProforma")) {
				jButtonModificarTipoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoProforma")) {
				jButtonActualizarTipoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoProforma")) {
				jButtonEliminarTipoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoProforma")) {
				jButtonGuardarCambiosTipoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoProforma")) {
				jButtonCancelarTipoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoProforma")) {
				jButtonCerrarTipoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoProforma")) {
				jButtonGuardarCambiosTipoProformaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoProforma")) {
				jButtonNuevoGuardarCambiosTipoProformaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoProforma")) {
				jButtonAbrirOrderByTipoProformaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoProforma")) {
				jButtonRecargarInformacionTipoProformaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoProforma")) {
				jButtonAnterioresTipoProformaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoProforma")) {
				jButtonSiguientesTipoProformaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoProformaBusqueda")) {
				this.jButtonidTipoProformaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoProformaUpdate")) {
				this.jButtonid_empresaTipoProformaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoProformaBusqueda")) {
				this.jButtonid_empresaTipoProformaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoProformaBusqueda")) {
				this.jButtoncodigoTipoProformaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoProformaBusqueda")) {
				this.jButtonnombreTipoProformaBusquedaActionPerformed(evt);
			}
			
			TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoProforma();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoProforma")) {
				closingInternalFrameTipoProforma();
				
			} else if(sTipo.equals("jButtonCancelarTipoProforma")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoProforma = (JInternalFrameBase)evt.getSource();
	            	
	            TipoProformaBeanSwingJInternalFrame jInternalFrameParent=(TipoProformaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoProforma.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoProformaActionPerformed(null);
			}
			
			TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoproforma,new Object(),this.tipoproformaParameterGeneral,this.tipoproformaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoProforma(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoProforma(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoProforma(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoproforma)) {
			if(!esControlTabla) {
				if(TipoProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoProforma(this.tipoproforma,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProforma(this.tipoproforma);			
				}
				
				if(this.tipoproformaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoProforma(this.tipoproforma,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoproformaReturnGeneral=tipoproformaLogic.procesarEventosTipoProformasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoproformaLogic.getTipoProformas(),this.tipoproforma,this.tipoproformaParameterGeneral,this.isEsNuevoTipoProforma,classes);//this.tipoproformaLogic.getTipoProforma()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoProforma(this.tipoproformaReturnGeneral,this.tipoproformaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoproformaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoProforma(classes,this.tipoproformaReturnGeneral,this.tipoproformaBean,false);
					}
						
					if(this.tipoproformaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoProforma(this.tipoproformaReturnGeneral.getTipoProforma());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoProforma(this.tipoproformaReturnGeneral.getTipoProforma());	
					}
						
					if(this.tipoproformaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoProforma(this.tipoproformaReturnGeneral.getTipoProforma(),classes);//this.tipoproformaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoProforma(this.tipoproforma,classes);//this.tipoproformaBean);									
				}
			
				if(TipoProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoProforma(this.tipoproforma,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProforma(this.tipoproforma);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoproformaAnterior!=null) {
						this.tipoproforma=this.tipoproformaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoproformaReturnGeneral=tipoproformaLogic.procesarEventosTipoProformasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoproformaLogic.getTipoProformas(),this.tipoproforma,this.tipoproformaParameterGeneral,this.isEsNuevoTipoProforma,classes);//this.tipoproformaLogic.getTipoProforma()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoproformaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoproformaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoproformaReturnGeneral.getTipoProforma(),tipoproformaLogic.getTipoProformas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoproformaReturnGeneral.getTipoProforma(),this.tipoproformas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoProforma.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoProforma.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoProforma();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoProforma() throws Exception {
		
		TipoProformaModel tipoproformaModel=(TipoProformaModel)this.jTableDatosTipoProforma.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoproformaModel.tipoproformas=this.tipoproformaLogic.getTipoProformas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoproformaModel.tipoproformas=this.tipoproformas;
		}
		
		
		((TipoProformaModel) this.jTableDatosTipoProforma.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoProforma() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoproformaAnterior(),this.tipoproformaLogic.getTipoProformas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoproformaAnterior(),this.tipoproformas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoProforma();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoProforma(TipoProforma tipoproforma,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Proforma.class)) {
					this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.proformaLogic.setProformas(tipoproforma.getProformas());
					this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProforma(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
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
										
				TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoproforma,new Object(),generalEntityParameterGeneral,this.tipoproformaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoproformaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoProformaConstantesFunciones.getClassesRelationshipsOfTipoProforma(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoProformaConstantesFunciones.getClassesRelationshipsFromStringsOfTipoProforma(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoProforma(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoproforma,new Object(),generalEntityParameterGeneral,this.tipoproformaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoProforma(TipoProformaBean tipoproformaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Proforma.class)) {
					this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.proformaLogic.setProformas(tipoproforma.getProformas());
					this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProforma(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoProforma(ArrayList<Classe> classes,TipoProformaReturnGeneral tipoproformaReturnGeneral,TipoProformaBean tipoproformaBean,Boolean conDefault) throws Exception {
		
			this.tipoproformaBean.setProformas(tipoproformaReturnGeneral.getTipoProforma().getProformas());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoProforma(TipoProforma tipoproforma,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Proforma.class)) {
					tipoproforma.setProformas(this.jInternalFrameDetalleFormTipoProforma.proformaBeanSwingJInternalFrame.proformaLogic.getProformas());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipoproforma)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoProforma = new TipoProformaDetalleFormJInternalFrame(jDesktopPane,this.tipoproformaSessionBean.getConGuardarRelaciones(),this.tipoproformaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoProforma);
		this.jInternalFrameDetalleFormTipoProforma.setVisible(false);
		this.jInternalFrameDetalleFormTipoProforma.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoProforma.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoProforma.tipoproformaLogic=this.tipoproformaLogic;
		
		this.cargarCombosFrameForeignKeyTipoProforma("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoProforma();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoProforma();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoProforma("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoProforma();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoProforma.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoProforma"));
		
		this.jInternalFrameDetalleFormTipoProforma.jButtonModificarTipoProforma.addActionListener(new ButtonActionListener(this,"ModificarTipoProforma"));

		
		this.jInternalFrameDetalleFormTipoProforma.jButtonModificarToolBarTipoProforma.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoProforma"));
					
		this.jInternalFrameDetalleFormTipoProforma.jMenuItemModificarTipoProforma.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoProforma"));		
		
		
		
		this.jInternalFrameDetalleFormTipoProforma.jButtonActualizarTipoProforma.addActionListener (new ButtonActionListener(this,"ActualizarTipoProforma"));
		
		
		this.jInternalFrameDetalleFormTipoProforma.jButtonActualizarToolBarTipoProforma.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoProforma"));
						
		this.jInternalFrameDetalleFormTipoProforma.jMenuItemActualizarTipoProforma.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoProforma"));		
		
		
		
		this.jInternalFrameDetalleFormTipoProforma.jButtonEliminarTipoProforma.addActionListener (new ButtonActionListener(this,"EliminarTipoProforma"));
		
		
		this.jInternalFrameDetalleFormTipoProforma.jButtonEliminarToolBarTipoProforma.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoProforma"));
								
		this.jInternalFrameDetalleFormTipoProforma.jMenuItemEliminarTipoProforma.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoProforma"));		
		
		
		
		this.jInternalFrameDetalleFormTipoProforma.jButtonCancelarTipoProforma.addActionListener (new ButtonActionListener(this,"CancelarTipoProforma"));
		
		
		this.jInternalFrameDetalleFormTipoProforma.jButtonCancelarToolBarTipoProforma.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoProforma"));
					
		this.jInternalFrameDetalleFormTipoProforma.jMenuItemCancelarTipoProforma.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoProforma"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoProforma.jMenuItemDetalleCerrarTipoProforma.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoProforma"));		
		
		
		
		this.jInternalFrameDetalleFormTipoProforma.jButtonGuardarCambiosToolBarTipoProforma.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoProforma"));
		
		
		
		this.jInternalFrameDetalleFormTipoProforma.jButtonGuardarCambiosToolBarTipoProforma.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoProforma"));
		
		
		
		this.jInternalFrameDetalleFormTipoProforma.jComboBoxTiposAccionesFormularioTipoProforma.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoProforma"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProforma.jButtonidTipoProformaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoProformaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoProforma.jButtonid_empresaTipoProformaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoProformaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProforma.jButtonid_empresaTipoProformaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProforma.jButtoncodigoTipoProformaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProforma.jButtonnombreTipoProformaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoProformaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoProforma.jTabbedPaneRelacionesTipoProforma.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoProforma"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoProforma"));
		
		if(this.jInternalFrameDetalleFormTipoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProforma.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoProforma"));
		}
		
		this.jTableDatosTipoProforma.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoProforma"));
		
		this.jTableDatosTipoProforma.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoProforma"));
		
		this.jButtonNuevoTipoProforma.addActionListener(new ButtonActionListener(this,"NuevoTipoProforma"));
		
		this.jButtonDuplicarTipoProforma.addActionListener(new ButtonActionListener(this,"DuplicarTipoProforma"));
		
		this.jButtonCopiarTipoProforma.addActionListener(new ButtonActionListener(this,"CopiarTipoProforma"));
		
		this.jButtonVerFormTipoProforma.addActionListener(new ButtonActionListener(this,"VerFormTipoProforma"));
		
		
		this.jButtonNuevoToolBarTipoProforma.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoProforma"));
			
		this.jButtonDuplicarToolBarTipoProforma.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoProforma"));
			
		this.jMenuItemNuevoTipoProforma.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoProforma"));
			
		this.jMenuItemDuplicarTipoProforma.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoProforma"));		
		
		
		this.jButtonNuevoRelacionesTipoProforma.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoProforma"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoProforma.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoProforma"));
			
		this.jMenuItemNuevoRelacionesTipoProforma.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoProforma"));		
		
		
		if(this.jInternalFrameDetalleFormTipoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProforma.jButtonModificarTipoProforma.addActionListener(new ButtonActionListener(this,"ModificarTipoProforma"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProforma.jButtonModificarToolBarTipoProforma.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoProforma"));
			
			this.jInternalFrameDetalleFormTipoProforma.jMenuItemModificarTipoProforma.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoProforma"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProforma!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoProforma.jButtonActualizarTipoProforma.addActionListener (new ButtonActionListener(this,"ActualizarTipoProforma"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProforma.jButtonActualizarToolBarTipoProforma.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoProforma"));
				
			this.jInternalFrameDetalleFormTipoProforma.jMenuItemActualizarTipoProforma.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoProforma"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProforma.jButtonEliminarTipoProforma.addActionListener (new ButtonActionListener(this,"EliminarTipoProforma"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProforma.jButtonEliminarToolBarTipoProforma.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoProforma"));
						
			this.jInternalFrameDetalleFormTipoProforma.jMenuItemEliminarTipoProforma.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoProforma"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProforma.jButtonCancelarTipoProforma.addActionListener (new ButtonActionListener(this,"CancelarTipoProforma"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProforma.jButtonCancelarToolBarTipoProforma.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoProforma"));
			
			this.jInternalFrameDetalleFormTipoProforma.jMenuItemCancelarTipoProforma.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoProforma"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoProforma.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoProforma"));		
		
		
		this.jButtonCerrarTipoProforma.addActionListener (new ButtonActionListener(this,"CerrarTipoProforma"));
		
		
		this.jButtonCerrarToolBarTipoProforma.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoProforma"));
			
		this.jMenuItemCerrarTipoProforma.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoProforma"));
			
		if(this.jInternalFrameDetalleFormTipoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProforma.jMenuItemDetalleCerrarTipoProforma.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoProforma"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProforma.jButtonGuardarCambiosTipoProforma.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoProforma"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProforma.jButtonGuardarCambiosToolBarTipoProforma.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoProforma"));
		}
		
		this.jButtonCopiarToolBarTipoProforma.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoProforma"));
			
		this.jButtonVerFormToolBarTipoProforma.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoProforma"));
		
		this.jMenuItemGuardarCambiosTipoProforma.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoProforma"));
			
		this.jMenuItemCopiarTipoProforma.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoProforma"));		
		
		this.jMenuItemVerFormTipoProforma.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoProforma"));		
		
		
		this.jButtonGuardarCambiosTablaTipoProforma.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoProforma"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoProforma.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoProforma"));
			
		this.jMenuItemGuardarCambiosTablaTipoProforma.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoProforma"));		
		
		
		
		this.jButtonRecargarInformacionTipoProforma.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoProforma"));
					
		this.jButtonRecargarInformacionToolBarTipoProforma.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoProforma"));
		
		this.jMenuItemRecargarInformacionTipoProforma.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoProforma"));		
		
		
		
		this.jButtonAnterioresTipoProforma.addActionListener (new ButtonActionListener(this,"AnterioresTipoProforma"));
		
		
		this.jButtonAnterioresToolBarTipoProforma.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoProforma"));
		
		this.jMenuItemAnterioresTipoProforma.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoProforma"));		
		
		
		this.jButtonSiguientesTipoProforma.addActionListener (new ButtonActionListener(this,"SiguientesTipoProforma"));
		
		
		this.jButtonSiguientesToolBarTipoProforma.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoProforma"));
			
		this.jMenuItemSiguientesTipoProforma.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoProforma"));
			
		this.jMenuItemAbrirOrderByTipoProforma.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoProforma"));
			
		this.jMenuItemMostrarOcultarTipoProforma.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoProforma"));
			
		this.jMenuItemDetalleAbrirOrderByTipoProforma.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoProforma"));
			
		this.jMenuItemDetalleMostarOcultarTipoProforma.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoProforma"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoProforma.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoProforma"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoProforma.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoProforma"));
			
		this.jMenuItemNuevoGuardarCambiosTipoProforma.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoProforma"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoProforma.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoProforma"));

		this.jCheckBoxSeleccionadosTipoProforma.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoProforma"));
		
		if(this.jInternalFrameDetalleFormTipoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProforma.jComboBoxTiposAccionesFormularioTipoProforma.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoProforma"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoProforma.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoProforma"));
			
		this.jComboBoxTiposAccionesTipoProforma.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoProforma"));
					
		this.jComboBoxTiposSeleccionarTipoProforma.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoProforma"));
			
		this.jTextFieldValorCampoGeneralTipoProforma.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoProforma"));		
		
		
		if(this.jInternalFrameDetalleFormTipoProforma!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProforma.jButtonidTipoProformaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoProformaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoProforma.jButtonid_empresaTipoProformaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoProformaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProforma.jButtonid_empresaTipoProformaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProforma.jButtoncodigoTipoProformaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProforma.jButtonnombreTipoProformaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoProformaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoProforma!=null) {
				this.jInternalFrameReporteDinamicoTipoProforma.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoProforma"));
				this.jInternalFrameReporteDinamicoTipoProforma.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoProforma"));
				this.jInternalFrameReporteDinamicoTipoProforma.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoProforma"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoProforma.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoProforma"));				
			//this.jButtonGenerarReporteDinamicoTipoProforma.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoProforma"));
			//this.jButtonGenerarExcelReporteDinamicoTipoProforma.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoProforma"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoProforma!=null) {
				this.jInternalFrameImportacionTipoProforma.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoProforma"));
				this.jInternalFrameImportacionTipoProforma.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoProforma"));
				this.jInternalFrameImportacionTipoProforma.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoProforma"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoProforma.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoProforma"));
			
			this.jButtonAbrirOrderByToolBarTipoProforma.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoProforma"));			
			
			if(this.jInternalFrameOrderByTipoProforma!=null) {
				this.jInternalFrameOrderByTipoProforma.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoProforma"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoProforma!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProforma.jTabbedPaneRelacionesTipoProforma.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoProforma"));
		
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
            		closingInternalFrameTipoProforma();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoProforma.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoProforma = (JInternalFrameBase)event.getSource();
	            	
	            TipoProformaBeanSwingJInternalFrame jInternalFrameParent=(TipoProformaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoProforma.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoProformaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoProforma.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoProformaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoProforma.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoProforma.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProformaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProformaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProformaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoProforma";
		inputMap = this.jButtonNuevoTipoProforma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoProforma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoProformaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProformaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProformaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProformaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoProforma";
		inputMap = this.jButtonNuevoRelacionesTipoProforma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoProforma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoProformaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoProforma";
		inputMap = this.jButtonModificarTipoProforma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoProforma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoProformaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoProforma";
		inputMap = this.jButtonActualizarTipoProforma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoProforma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoProformaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoProforma";
		inputMap = this.jButtonEliminarTipoProforma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoProforma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoProformaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoProforma";
		inputMap = this.jButtonCancelarTipoProforma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoProforma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoProformaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoProforma";
		inputMap = this.jButtonCerrarTipoProforma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoProforma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoProformaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoProforma.jButtonGuardarCambiosTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoProforma";
		inputMap = this.jInternalFrameDetalleFormTipoProforma.jButtonGuardarCambiosTipoProforma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoProforma.jButtonGuardarCambiosTipoProforma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoProformaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoProforma.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoProformaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoProforma.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoProformaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoProforma.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoProformaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoProforma.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoProformaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProforma.jButtonidTipoProformaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoProformaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoProforma.jButtonid_empresaTipoProformaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoProformaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProforma.jButtonid_empresaTipoProformaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProforma.jButtoncodigoTipoProformaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProforma.jButtonnombreTipoProformaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoProformaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoProformaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoProforma.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoProforma(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoProforma tipoproformaAux:this.tipoproformaLogic.getTipoProformas()) {
					tipoproformaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoProforma tipoproformaAux:tipoproformas) {
					tipoproformaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoProformaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoProforma(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoProforma tipoproformaAux:this.tipoproformaLogic.getTipoProformas()) {
						tipoproformaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoProforma tipoproformaAux:tipoproformas) {
						tipoproformaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoProforma tipoproformaAux:this.tipoproformaLogic.getTipoProformas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoProforma tipoproformaAux:tipoproformas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoProforma(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoProforma.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoProforma.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoProforma,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoProformaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoProforma(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoProforma.getSelectedRows();
			
			TipoProforma tipoproformaLocal=new TipoProforma();
			
			//this.seleccionarTodosTipoProforma(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoproformaLocal =(TipoProforma) this.tipoproformaLogic.getTipoProformas().toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoproformaLocal =(TipoProforma) this.tipoproformas.toArray()[this.jTableDatosTipoProforma.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoproformaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoProforma tipoproformaAux:this.tipoproformaLogic.getTipoProformas()) {
						tipoproformaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoProforma tipoproformaAux:tipoproformas) {
						tipoproformaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoProforma(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoProforma.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoProforma.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoProforma,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoProformaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoProformaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoProformaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoProforma(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoProforma.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoProforma tipoproformaAux:this.tipoproformaLogic.getTipoProformas()) {
				
						if(sTipoSeleccionar.equals(TipoProformaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoproformaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoProformaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoproformaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoProforma tipoproformaAux:tipoproformas) {
					
						if(sTipoSeleccionar.equals(TipoProformaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoproformaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoProformaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoproformaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoProforma(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoProformaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoProforma(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoProforma=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoProforma.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoProforma.jComboBoxTiposAccionesFormularioTipoProforma.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoProforma) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoProforma(conSplash);
				
					this.generarReporteTipoProformasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoProforma.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoProforma.jComboBoxTiposAccionesFormularioTipoProforma.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoProformasSeleccionados();
				//this.jComboBoxTiposAccionesTipoProforma.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoProformasSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoProforma.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoProformasSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoProforma.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoProforma();
				
				this.exportarTipoProformasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoProforma.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoProforma.jComboBoxTiposAccionesFormularioTipoProforma.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoProformas();
				//this.importarTipoProformas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoProforma.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoProforma.jComboBoxTiposAccionesFormularioTipoProforma.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoProforma();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoProformasSeleccionados();
				//this.jComboBoxTiposAccionesTipoProforma.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Proforma", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoProforma();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoProforma)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoProforma(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Proforma",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoProforma.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoProforma.jComboBoxTiposAccionesFormularioTipoProforma.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoProformaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoProforma) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoProforma(conSplash);
					
						//this.actualizarParametrosGeneralTipoProforma();
						
						this.generarReporteProcesoAccionTipoProformasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoProforma.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoProforma.jComboBoxTiposAccionesFormularioTipoProforma.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoProformaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo ProformaS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Proforma", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoProforma();
				
						this.actualizarParametrosGeneralTipoProforma();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipoproformaReturnGeneral=tipoproformaLogic.procesarAccionTipoProformasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipoproformaLogic.getTipoProformas(),this.tipoproformaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoProformaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoProforma.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoProforma.jComboBoxTiposAccionesFormularioTipoProforma.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoProforma();
					
					TipoProformaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoProformaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoProforma.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoProforma.jComboBoxTiposAccionesFormularioTipoProforma.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoProforma(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoProformaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoProforma();
			
			if(this.jInternalFrameDetalleFormTipoProforma==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoProforma> tipoproformasSeleccionados=new ArrayList<TipoProforma>();		
			TipoProforma tipoproforma=new TipoProforma();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoProforma(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoProforma.getSelectedItem();
			
			
			
			
			tipoproformasSeleccionados=this.getTipoProformasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoproformasSeleccionados.size()==1) {
				for(TipoProforma tipoproformaAux:tipoproformasSeleccionados) {
					tipoproforma=tipoproformaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Proforma")) {
					jButtonProformaActionPerformed(null,rowIndex,true,false,tipoproforma);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoProforma();
			
      		//this.finishProcessTipoProforma(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoProformaReturnGeneral() throws Exception {
		if(this.tipoproformaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoproformaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoproformaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoproformaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoproformaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoproformaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoProforma(false);
		}
		
		if(this.tipoproformaReturnGeneral.getConRetornoLista() || this.tipoproformaReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoproformaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoproformaLogic.setTipoProformas(this.tipoproformaReturnGeneral.getTipoProformas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoproformaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoproformaLogic.setTipoProforma(this.tipoproformaReturnGeneral.getTipoProforma());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoProforma(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoProforma() throws Exception {
		
		
	}
	
	public ArrayList<TipoProforma> getTipoProformasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoProforma> tipoproformasSeleccionados=new ArrayList<TipoProforma>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoProforma) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoProforma tipoproformaAux:tipoproformaLogic.getTipoProformas()) {
					if(tipoproformaAux.getIsSelected()) {
						tipoproformasSeleccionados.add(tipoproformaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoProforma tipoproformaAux:this.tipoproformas) {
					if(tipoproformaAux.getIsSelected()) {
						tipoproformasSeleccionados.add(tipoproformaAux);				
					}
				}
			}
			
			if(tipoproformasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoproformasSeleccionados.addAll(this.tipoproformaLogic.getTipoProformas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoproformasSeleccionados.addAll(this.tipoproformas);				
					}
				}
			}
		} else {
			tipoproformasSeleccionados.add(this.tipoproforma);
		}
		
		return tipoproformasSeleccionados;
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
	
	public void generarReporteTipoProformasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoProformasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoProformasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoProformasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoProformasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoProformasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Proforma",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoProformasSeleccionados() throws Exception {
		ArrayList<TipoProforma> tipoproformasSeleccionados=new ArrayList<TipoProforma>();		
		
		tipoproformasSeleccionados=this.getTipoProformasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoProformas("Todos",tipoproformasSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoProformasSeleccionados() throws Exception {
		ArrayList<TipoProforma> tipoproformasSeleccionados=new ArrayList<TipoProforma>();		
		
		tipoproformasSeleccionados=this.getTipoProformasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoProformas("Todos",tipoproformasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoProformasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoProforma> tipoproformasSeleccionados=new ArrayList<TipoProforma>();
		
		tipoproformasSeleccionados=this.getTipoProformasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoProformas("Todos",tipoproformasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoProformasSeleccionados() throws Exception {
		ArrayList<TipoProforma> tipoproformasSeleccionados=new ArrayList<TipoProforma>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoProforma();
		
		
		tipoproformasSeleccionados=this.getTipoProformasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoProforma();
		
		
		//this.generarReporteTipoProformas("Todos",tipoproformasSeleccionados ,tipoproformaImplementable,tipoproformaImplementableHome);
	}
	
	public void mostrarImportacionTipoProformas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoProforma();
		
		this.abrirFrameImportacionTipoProforma();		
		
			
		//this.generarReporteTipoProformas("Todos",tipoproformasSeleccionados ,tipoproformaImplementable,tipoproformaImplementableHome);
	}
	
	public void importarTipoProformas() throws Exception {		
	
	}
	
	public void exportarTipoProformasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoProformasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoProformasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoProformasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Proforma",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoProformasSeleccionados() throws Exception {
		ArrayList<TipoProforma> tipoproformasSeleccionados=new ArrayList<TipoProforma>();		
		
		tipoproformasSeleccionados=this.getTipoProformasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoproforma."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoProforma(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoProforma tipoproformaAux:tipoproformasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoProforma(tipoproformaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoproformaAux.setsDetalleGeneralEntityReporte(tipoproformaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Proforma",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoProforma(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoProformaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoProformaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoProformaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoProformaConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoProformaConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoProforma(TipoProforma tipoproforma,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoproforma.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoproforma.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoproforma.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoproforma.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoproforma.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoProformasSeleccionados() throws Exception {
		ArrayList<TipoProforma> tipoproformasSeleccionados=new ArrayList<TipoProforma>();		
		
		tipoproformasSeleccionados=this.getTipoProformasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoproforma.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoProformas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoProforma(row);				
				iRow++;
			}				
			
			for(TipoProforma tipoproformaAux:tipoproformasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoProforma(tipoproformaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Proforma",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoProformasSeleccionados() throws Exception {
		ArrayList<TipoProforma> tipoproformasSeleccionados=new ArrayList<TipoProforma>();		
		
		tipoproformasSeleccionados=this.getTipoProformasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoproforma.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoproformas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoproforma");
			//elementRoot.appendChild(element);
		
			for(TipoProforma tipoproformaAux:tipoproformasSeleccionados) {
				element = document.createElement("tipoproforma");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoProforma(tipoproformaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Proforma",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoProforma(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoProformaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoProformaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoProformaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoProformaConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoProformaConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoProforma(TipoProforma tipoproforma,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoproforma.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoproforma.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoproforma.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoproforma.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoProforma(TipoProforma tipoproforma,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoProformaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoproforma.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoProformaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoproforma.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoProformaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipoproforma.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoProformaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipoproforma.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoProformaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoproforma.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoProformasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoProforma> tipoproformasSeleccionados=new ArrayList<TipoProforma>();
		
		tipoproformasSeleccionados=this.getTipoProformasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoProforma(tipoproformasSeleccionados);
		
		this.generarReporteTipoProformas("Todos",tipoproformasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoProforma(ArrayList<TipoProforma> tipoproformasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoProforma tipoproformaAux:tipoproformasSeleccionados) {
				tipoproformaAux.setsDetalleGeneralEntityReporte(tipoproformaAux.toString());
			
				if(sTipoSeleccionar.equals(TipoProformaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipoproformaAux.setsDescripcionGeneralEntityReporte1(tipoproformaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoProformaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipoproformaAux.setsDescripcionGeneralEntityReporte1(tipoproformaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoProformaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoproformaAux.setsDescripcionGeneralEntityReporte1(tipoproformaAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoProforma(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoProforma=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoProforma=true;
				this.isVisibilidadCeldaGuardarCambiosTipoProforma=true;
			}
			
			this.isVisibilidadCeldaModificarTipoProforma=false;
			this.isVisibilidadCeldaActualizarTipoProforma=false;
			this.isVisibilidadCeldaEliminarTipoProforma=false;
			this.isVisibilidadCeldaCancelarTipoProforma=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProforma=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoProforma=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoProforma=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProforma=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProforma=false;
			this.isVisibilidadCeldaModificarTipoProforma=false;
			this.isVisibilidadCeldaActualizarTipoProforma=true;
			this.isVisibilidadCeldaEliminarTipoProforma=false;
			this.isVisibilidadCeldaCancelarTipoProforma=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProforma=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoProforma=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoProforma=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProforma=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProforma=false;
			this.isVisibilidadCeldaModificarTipoProforma=false;
			this.isVisibilidadCeldaActualizarTipoProforma=true;
			this.isVisibilidadCeldaEliminarTipoProforma=true;
			this.isVisibilidadCeldaCancelarTipoProforma=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProforma=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoProforma=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoProforma=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProforma=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProforma=false;
			this.isVisibilidadCeldaModificarTipoProforma=false;
			this.isVisibilidadCeldaActualizarTipoProforma=true;
			this.isVisibilidadCeldaEliminarTipoProforma=false;
			this.isVisibilidadCeldaCancelarTipoProforma=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProforma=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoProforma=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoProforma=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoProforma=true;
			this.isVisibilidadCeldaGuardarCambiosTipoProforma=true;
			this.isVisibilidadCeldaModificarTipoProforma=false;
			this.isVisibilidadCeldaActualizarTipoProforma=false;
			this.isVisibilidadCeldaEliminarTipoProforma=false;
			this.isVisibilidadCeldaCancelarTipoProforma=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProforma=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoProforma=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoProforma=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProforma=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProforma=false;
			this.isVisibilidadCeldaActualizarTipoProforma=false;
			this.isVisibilidadCeldaEliminarTipoProforma=false;
			this.isVisibilidadCeldaCancelarTipoProforma=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProforma=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoProforma=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoProforma=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProforma=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProforma=false;
			this.isVisibilidadCeldaModificarTipoProforma=true;
			this.isVisibilidadCeldaActualizarTipoProforma=false;
			this.isVisibilidadCeldaEliminarTipoProforma=false;
			this.isVisibilidadCeldaCancelarTipoProforma=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProforma=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoProforma=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoProformaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoProforma=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoProforma=true;
			this.isVisibilidadCeldaGuardarCambiosTipoProforma=true;
		} else {
			this.actualizarEstadoPanelsTipoProforma(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoProforma=false;
			//this.isVisibilidadCeldaVerFormTipoProforma=false;
			this.isVisibilidadCeldaDuplicarTipoProforma=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoproformaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoProforma=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoProforma=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProforma=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoproformaSessionBean.getEsGuardarRelacionado()) {
			if(!tipoproformaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoProforma=false;												
			}
			
			this.jButtonCerrarTipoProforma.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoProforma=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoproforma)) {
			this.isVisibilidadCeldaActualizarTipoProforma=false;
			this.isVisibilidadCeldaEliminarTipoProforma=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoProforma() {
		this.isVisibilidadCeldaNuevoTipoProforma=false;
		this.isVisibilidadCeldaGuardarCambiosTipoProforma=false;
	}
	
	public void actualizarEstadoPanelsTipoProforma(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoProforma!=null) {
				this.jScrollPanelDatosEdicionTipoProforma.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProforma!=null) {
				this.jTabbedPaneBusquedasTipoProforma.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoProforma!=null) {
				this.jScrollPanelDatosTipoProforma.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoProforma!=null) {
				this.jPanelPaginacionTipoProforma.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoProforma!=null) {
				this.jPanelParametrosReportesTipoProforma.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoProforma!=null) {
				this.jScrollPanelDatosEdicionTipoProforma.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProforma!=null) {
				this.jTabbedPaneBusquedasTipoProforma.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoProforma!=null) {
				this.jScrollPanelDatosTipoProforma.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoProforma!=null) {
				this.jPanelPaginacionTipoProforma.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoProforma!=null) {
				this.jPanelParametrosReportesTipoProforma.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoProforma!=null) {
				this.jScrollPanelDatosEdicionTipoProforma.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProforma!=null) {
				this.jTabbedPaneBusquedasTipoProforma.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoProforma!=null) {
				this.jScrollPanelDatosTipoProforma.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoProforma!=null) {
				this.jPanelPaginacionTipoProforma.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoProforma!=null) {
				this.jPanelParametrosReportesTipoProforma.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoProforma!=null) {
				this.jScrollPanelDatosEdicionTipoProforma.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProforma!=null) {
				this.jTabbedPaneBusquedasTipoProforma.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoProforma!=null) {
				this.jScrollPanelDatosTipoProforma.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoProforma!=null) {
				this.jPanelPaginacionTipoProforma.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoProforma!=null) {
				this.jPanelParametrosReportesTipoProforma.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoProforma!=null) {
				this.jScrollPanelDatosEdicionTipoProforma.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProforma!=null) {
				this.jTabbedPaneBusquedasTipoProforma.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoProforma!=null) {
				this.jScrollPanelDatosTipoProforma.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoProforma!=null) {
				this.jPanelPaginacionTipoProforma.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoProforma!=null) {
				this.jPanelParametrosReportesTipoProforma.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoProforma!=null) {
				this.jScrollPanelDatosEdicionTipoProforma.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProforma!=null) {
				this.jTabbedPaneBusquedasTipoProforma.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoProforma!=null) {
				this.jScrollPanelDatosTipoProforma.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoProforma!=null) {
				this.jPanelPaginacionTipoProforma.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoProforma!=null) {
				this.jPanelParametrosReportesTipoProforma.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoProforma!=null) {
				this.jScrollPanelDatosEdicionTipoProforma.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProforma!=null) {
				this.jTabbedPaneBusquedasTipoProforma.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoProforma!=null) {
				this.jScrollPanelDatosTipoProforma.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoProforma!=null) {
				this.jPanelPaginacionTipoProforma.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoProforma!=null) {
				this.jPanelParametrosReportesTipoProforma.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoproformaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoProforma!=null) {
					this.jTabbedPaneBusquedasTipoProforma.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoProforma!=null) {
				this.jPanelParametrosReportesTipoProforma.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoproformaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoProforma!=null) {
				this.jTabbedPaneBusquedasTipoProforma.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoProforma!=null) {
				this.jPanelParametrosReportesTipoProforma.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionTipoProformaParaProformas() throws Exception {
		Boolean isPaginaPopupProforma=false;

		try {

			if(this.tipoproformaSessionBean==null) {
				this.tipoproformaSessionBean=new TipoProformaSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoProforma.proformaSessionBean==null) {
				this.jInternalFrameDetalleFormTipoProforma.proformaSessionBean=new ProformaSessionBean();
			}

			this.jInternalFrameDetalleFormTipoProforma.proformaSessionBean.setsPathNavegacionActual(tipoproformaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProformaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoProforma.proformaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupProforma=this.jInternalFrameDetalleFormTipoProforma.proformaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoProforma.proformaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProforma(true);
			this.jInternalFrameDetalleFormTipoProforma.proformaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProforma(TipoProformaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoProforma.proformaSessionBean.setisBusquedaDesdeForeignKeySesionTipoProforma(true);
			this.jInternalFrameDetalleFormTipoProforma.proformaSessionBean.setlidTipoProformaActual(this.idTipoProformaActual);

			tipoproformaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoProforma(true);
			tipoproformaSessionBean.setlIdTipoProformaActualForeignKey(this.idTipoProformaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoProformaSessionBean tipoproformaSessionBean=new TipoProformaSessionBean();
		
		if(this.tipoproformaSessionBean==null) {
			this.tipoproformaSessionBean=new TipoProformaSessionBean();
		}
		
		this.tipoproformaSessionBean.setsUltimaBusquedaTipoProforma(this.getsAccionBusqueda());
		this.tipoproformaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoproformaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipoproformaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoProformaSessionBean tipoproformaSessionBean=new TipoProformaSessionBean();
		
		if(this.tipoproformaSessionBean==null) {
			this.tipoproformaSessionBean=new TipoProformaSessionBean();
		}
		
		if(this.tipoproformaSessionBean.getsUltimaBusquedaTipoProforma()!=null&&!this.tipoproformaSessionBean.getsUltimaBusquedaTipoProforma().equals("")) {
			this.setsAccionBusqueda(tipoproformaSessionBean.getsUltimaBusquedaTipoProforma());
			this.setiNumeroPaginacion(tipoproformaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoproformaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipoproformaSessionBean.getid_empresa());
				tipoproformaSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipoproformaSessionBean.setsUltimaBusquedaTipoProforma("");
		this.tipoproformaSessionBean.setiNumeroPaginacion(TipoProformaConstantesFunciones.INUMEROPAGINACION);
		this.tipoproformaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoProforma(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoProforma() {
		this.updateBorderResaltarBusquedasFormularioTipoProforma();
		this.updateVisibilidadBusquedasFormularioTipoProforma();
		this.updateHabilitarBusquedasFormularioTipoProforma();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoProforma() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoProforma.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoProforma() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoProforma.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoProforma() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoProforma.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoProforma(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoProforma.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoProforma() throws Exception {

		if(this.jInternalFrameDetalleFormTipoProforma==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoProforma();
		this.updateVisibilidadResaltarControlesFormularioTipoProforma();
		this.updateHabilitarResaltarControlesFormularioTipoProforma();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoProforma() throws Exception {
		if(this.jInternalFrameDetalleFormTipoProforma==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoproformaConstantesFunciones.resaltaridTipoProforma!=null && this.jInternalFrameDetalleFormTipoProforma!=null) {this.jInternalFrameDetalleFormTipoProforma.jLabelidTipoProforma.setBorder(this.tipoproformaConstantesFunciones.resaltaridTipoProforma);}
		if(this.tipoproformaConstantesFunciones.resaltarid_empresaTipoProforma!=null && this.jInternalFrameDetalleFormTipoProforma!=null) {this.jInternalFrameDetalleFormTipoProforma.jComboBoxid_empresaTipoProforma.setBorder(this.tipoproformaConstantesFunciones.resaltarid_empresaTipoProforma);}
		if(this.tipoproformaConstantesFunciones.resaltarcodigoTipoProforma!=null && this.jInternalFrameDetalleFormTipoProforma!=null) {this.jInternalFrameDetalleFormTipoProforma.jTextFieldcodigoTipoProforma.setBorder(this.tipoproformaConstantesFunciones.resaltarcodigoTipoProforma);}
		if(this.tipoproformaConstantesFunciones.resaltarnombreTipoProforma!=null && this.jInternalFrameDetalleFormTipoProforma!=null) {this.jInternalFrameDetalleFormTipoProforma.jTextAreanombreTipoProforma.setBorder(this.tipoproformaConstantesFunciones.resaltarnombreTipoProforma);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoProforma() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoProforma==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoProforma!=null) {
	
		//this.jInternalFrameDetalleFormTipoProforma.jLabelidTipoProforma.setVisible(this.tipoproformaConstantesFunciones.mostraridTipoProforma);
		this.jInternalFrameDetalleFormTipoProforma.jPanelidTipoProforma.setVisible(this.tipoproformaConstantesFunciones.mostraridTipoProforma);
		//this.jInternalFrameDetalleFormTipoProforma.jComboBoxid_empresaTipoProforma.setVisible(this.tipoproformaConstantesFunciones.mostrarid_empresaTipoProforma);
		this.jInternalFrameDetalleFormTipoProforma.jPanelid_empresaTipoProforma.setVisible(this.tipoproformaConstantesFunciones.mostrarid_empresaTipoProforma);
		//this.jInternalFrameDetalleFormTipoProforma.jTextFieldcodigoTipoProforma.setVisible(this.tipoproformaConstantesFunciones.mostrarcodigoTipoProforma);
		this.jInternalFrameDetalleFormTipoProforma.jPanelcodigoTipoProforma.setVisible(this.tipoproformaConstantesFunciones.mostrarcodigoTipoProforma);
		//this.jInternalFrameDetalleFormTipoProforma.jTextAreanombreTipoProforma.setVisible(this.tipoproformaConstantesFunciones.mostrarnombreTipoProforma);
		this.jInternalFrameDetalleFormTipoProforma.jPanelnombreTipoProforma.setVisible(this.tipoproformaConstantesFunciones.mostrarnombreTipoProforma);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoProforma() throws Exception {
		if(this.jInternalFrameDetalleFormTipoProforma==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoProforma!=null) {
	
		this.jInternalFrameDetalleFormTipoProforma.jLabelidTipoProforma.setEnabled(this.tipoproformaConstantesFunciones.activaridTipoProforma);
		this.jInternalFrameDetalleFormTipoProforma.jComboBoxid_empresaTipoProforma.setEnabled(this.tipoproformaConstantesFunciones.activarid_empresaTipoProforma);
		this.jInternalFrameDetalleFormTipoProforma.jTextFieldcodigoTipoProforma.setEnabled(this.tipoproformaConstantesFunciones.activarcodigoTipoProforma);
		this.jInternalFrameDetalleFormTipoProforma.jTextAreanombreTipoProforma.setEnabled(this.tipoproformaConstantesFunciones.activarnombreTipoProforma);
		}
	}
	
		
}