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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;




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

import com.bydan.erp.puntoventa.util.GrupoClienteFormaPagoConstantesFunciones;
import com.bydan.erp.puntoventa.util.GrupoClienteFormaPagoParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.GrupoClienteFormaPagoParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.GrupoClienteFormaPagoBean;
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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.puntoventa.resources.reportes.AuxiliarReportes;


import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.puntoventa.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class GrupoClienteFormaPagoBeanSwingJInternalFrame extends GrupoClienteFormaPagoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(GrupoClienteFormaPagoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<GrupoClienteFormaPago> grupoclienteformapagoValidator = new ClassValidator<GrupoClienteFormaPago>(GrupoClienteFormaPago.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public GrupoClienteFormaPago grupoclienteformapago;	
	public GrupoClienteFormaPago grupoclienteformapagoAux;
	public GrupoClienteFormaPago grupoclienteformapagoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public GrupoClienteFormaPago grupoclienteformapagoTotales;
	public Long idGrupoClienteFormaPagoActual;
	public Long iIdNuevoGrupoClienteFormaPago=0L;
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

	public String sFinalQueryComboGrupoCliente="";

	public List<GrupoCliente> grupoclientesForeignKey;

	public List<GrupoCliente> getgrupoclientesForeignKey() {
		return grupoclientesForeignKey;
	}

	public void setgrupoclientesForeignKey(List<GrupoCliente> grupoclientesForeignKey) {
		this.grupoclientesForeignKey = grupoclientesForeignKey;
	}

	//OBJETO FK ACTUAL
	public GrupoCliente grupoclienteForeignKey;

	public GrupoCliente getgrupoclienteForeignKey() {
		return grupoclienteForeignKey;
	}

	public void setgrupoclienteForeignKey(GrupoCliente grupoclienteForeignKey) {
		this.grupoclienteForeignKey = grupoclienteForeignKey;
	}

	public String sFinalQueryComboTipoFormaPago="";

	public List<TipoFormaPago> tipoformapagosForeignKey;

	public List<TipoFormaPago> gettipoformapagosForeignKey() {
		return tipoformapagosForeignKey;
	}

	public void settipoformapagosForeignKey(List<TipoFormaPago> tipoformapagosForeignKey) {
		this.tipoformapagosForeignKey = tipoformapagosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoFormaPago tipoformapagoForeignKey;

	public TipoFormaPago gettipoformapagoForeignKey() {
		return tipoformapagoForeignKey;
	}

	public void settipoformapagoForeignKey(TipoFormaPago tipoformapagoForeignKey) {
		this.tipoformapagoForeignKey = tipoformapagoForeignKey;
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
	
	public Boolean isPermisoTodoGrupoClienteFormaPago;
	public Boolean isPermisoNuevoGrupoClienteFormaPago;
	public Boolean isPermisoActualizarGrupoClienteFormaPago;
	public Boolean isPermisoActualizarOriginalGrupoClienteFormaPago;
	public Boolean isPermisoEliminarGrupoClienteFormaPago;
	public Boolean isPermisoGuardarCambiosGrupoClienteFormaPago;
	public Boolean isPermisoConsultaGrupoClienteFormaPago;
	public Boolean isPermisoBusquedaGrupoClienteFormaPago;
	public Boolean isPermisoReporteGrupoClienteFormaPago;
	public Boolean isPermisoPaginacionMedioGrupoClienteFormaPago;
	public Boolean isPermisoPaginacionAltoGrupoClienteFormaPago;
	public Boolean isPermisoPaginacionTodoGrupoClienteFormaPago;
	public Boolean isPermisoCopiarGrupoClienteFormaPago;
	public Boolean isPermisoVerFormGrupoClienteFormaPago;
	public Boolean isPermisoDuplicarGrupoClienteFormaPago;
	public Boolean isPermisoOrdenGrupoClienteFormaPago;
	
	
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
	
	public GrupoClienteFormaPagoParameterReturnGeneral grupoclienteformapagoReturnGeneral;
	public GrupoClienteFormaPagoParameterReturnGeneral grupoclienteformapagoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoGrupoClienteFormaPago=false;
	public Boolean esParaAccionDesdeFormularioGrupoClienteFormaPago=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected GrupoClienteFormaPagoSessionBeanAdditional grupoclienteformapagoSessionBeanAdditional=null;
	
	public GrupoClienteFormaPagoSessionBeanAdditional getGrupoClienteFormaPagoSessionBeanAdditional() {
		return this.grupoclienteformapagoSessionBeanAdditional;
	}
	
	public void setGrupoClienteFormaPagoSessionBeanAdditional(GrupoClienteFormaPagoSessionBeanAdditional grupoclienteformapagoSessionBeanAdditional) {
		try {
			this.grupoclienteformapagoSessionBeanAdditional=grupoclienteformapagoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional grupoclienteformapagoBeanSwingJInternalFrameAdditional=null;
	//public class GrupoClienteFormaPagoBeanSwingJInternalFrame
	
	public GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional getGrupoClienteFormaPagoBeanSwingJInternalFrameAdditional() {
		return this.grupoclienteformapagoBeanSwingJInternalFrameAdditional;
	}
	
	public void setGrupoClienteFormaPagoBeanSwingJInternalFrameAdditional(GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional grupoclienteformapagoBeanSwingJInternalFrameAdditional) {
		try {
			this.grupoclienteformapagoBeanSwingJInternalFrameAdditional=grupoclienteformapagoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public GrupoClienteFormaPagoLogic grupoclienteformapagoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public GrupoClienteFormaPago grupoclienteformapagoBean;
	public GrupoClienteFormaPagoConstantesFunciones grupoclienteformapagoConstantesFunciones;
	//public GrupoClienteFormaPagoParameterReturnGeneral grupoclienteformapagoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public GrupoClienteLogic grupoclienteLogic;
	public TipoFormaPagoLogic tipoformapagoLogic;
	
	//PARAMETROS
	
	
	//public List<GrupoClienteFormaPago> grupoclienteformapagos;	
	//public List<GrupoClienteFormaPago> grupoclienteformapagosEliminados;
	//public List<GrupoClienteFormaPago> grupoclienteformapagosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoGrupoClienteFormaPago=false;
	public Boolean isVisibilidadCeldaDuplicarGrupoClienteFormaPago=true;
	public Boolean isVisibilidadCeldaCopiarGrupoClienteFormaPago=true;
	public Boolean isVisibilidadCeldaVerFormGrupoClienteFormaPago=true;
	public Boolean isVisibilidadCeldaOrdenGrupoClienteFormaPago=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesGrupoClienteFormaPago=false;
	public Boolean isVisibilidadCeldaModificarGrupoClienteFormaPago=false;
	public Boolean isVisibilidadCeldaActualizarGrupoClienteFormaPago=false;
	public Boolean isVisibilidadCeldaEliminarGrupoClienteFormaPago=false;
	public Boolean isVisibilidadCeldaCancelarGrupoClienteFormaPago=false;
	public Boolean isVisibilidadCeldaGuardarGrupoClienteFormaPago=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosGrupoClienteFormaPago=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdGrupoCliente=false;
	public Boolean isVisibilidadFK_IdTipoFormaPago=false;
	
	public Long getiIdNuevoGrupoClienteFormaPago() {
		return this.iIdNuevoGrupoClienteFormaPago;
	}

	public void setiIdNuevoGrupoClienteFormaPago(Long iIdNuevoGrupoClienteFormaPago) {
		this.iIdNuevoGrupoClienteFormaPago = iIdNuevoGrupoClienteFormaPago;
	}
	
	public Long getidGrupoClienteFormaPagoActual() {
		return this.idGrupoClienteFormaPagoActual;
	}

	public void setidGrupoClienteFormaPagoActual(Long idGrupoClienteFormaPagoActual) {
		this.idGrupoClienteFormaPagoActual = idGrupoClienteFormaPagoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public GrupoClienteFormaPago getgrupoclienteformapago() {
		return this.grupoclienteformapago;
	}

	public void setgrupoclienteformapago(GrupoClienteFormaPago grupoclienteformapago) {
		this.grupoclienteformapago = grupoclienteformapago;
	}
	
	public GrupoClienteFormaPago getgrupoclienteformapagoAux() {
		return this.grupoclienteformapagoAux;
	}

	public void setgrupoclienteformapagoAux(GrupoClienteFormaPago grupoclienteformapagoAux) {
		this.grupoclienteformapagoAux = grupoclienteformapagoAux;
	}				
	
	public GrupoClienteFormaPago getgrupoclienteformapagoAnterior() {
		return this.grupoclienteformapagoAnterior;
	}

	public void setgrupoclienteformapagoAnterior(GrupoClienteFormaPago grupoclienteformapagoAnterior) {
		this.grupoclienteformapagoAnterior = grupoclienteformapagoAnterior;
	}	
	
	public GrupoClienteFormaPago getgrupoclienteformapagoTotales() {
		return this.grupoclienteformapagoTotales;
	}

	public void setgrupoclienteformapagoTotales(GrupoClienteFormaPago grupoclienteformapagoTotales) {
		this.grupoclienteformapagoTotales = grupoclienteformapagoTotales;
	}	
	
	public GrupoClienteFormaPago getgrupoclienteformapagoBean() {
		return this.grupoclienteformapagoBean;
	}

	public void setgrupoclienteformapagoBean(GrupoClienteFormaPago grupoclienteformapagoBean) {
		this.grupoclienteformapagoBean = grupoclienteformapagoBean;
	}	
	
	public GrupoClienteFormaPagoParameterReturnGeneral getgrupoclienteformapagoReturnGeneral() {
		return this.grupoclienteformapagoReturnGeneral;
	}

	public void setgrupoclienteformapagoReturnGeneral(GrupoClienteFormaPagoParameterReturnGeneral grupoclienteformapagoReturnGeneral) {
		this.grupoclienteformapagoReturnGeneral = grupoclienteformapagoReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_grupo_clienteFK_IdGrupoCliente=-1L;

	public Long getid_grupo_clienteFK_IdGrupoCliente() {
		return this.id_grupo_clienteFK_IdGrupoCliente;
	}

	public void setid_grupo_clienteFK_IdGrupoCliente(Long id_grupo_clienteFK_IdGrupoCliente) {
		this.id_grupo_clienteFK_IdGrupoCliente = id_grupo_clienteFK_IdGrupoCliente;
	}

	public Long id_tipo_forma_pagoFK_IdTipoFormaPago=-1L;

	public Long getid_tipo_forma_pagoFK_IdTipoFormaPago() {
		return this.id_tipo_forma_pagoFK_IdTipoFormaPago;
	}

	public void setid_tipo_forma_pagoFK_IdTipoFormaPago(Long id_tipo_forma_pagoFK_IdTipoFormaPago) {
		this.id_tipo_forma_pagoFK_IdTipoFormaPago = id_tipo_forma_pagoFK_IdTipoFormaPago;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public GrupoClienteFormaPagoLogic getGrupoClienteFormaPagoLogic()	{		
		return grupoclienteformapagoLogic;
	}

	public void setGrupoClienteFormaPagoLogic(GrupoClienteFormaPagoLogic grupoclienteformapagoLogic) {
		this.grupoclienteformapagoLogic = grupoclienteformapagoLogic;
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
	
	public Boolean getIsEsNuevoGrupoClienteFormaPago() {
		return isEsNuevoGrupoClienteFormaPago;
	}

	public void setIsEsNuevoGrupoClienteFormaPago(Boolean isEsNuevoGrupoClienteFormaPago) {
		this.isEsNuevoGrupoClienteFormaPago = isEsNuevoGrupoClienteFormaPago;
	}

	public Boolean getEsParaAccionDesdeFormularioGrupoClienteFormaPago() {
		return esParaAccionDesdeFormularioGrupoClienteFormaPago;
	}
	
	public void setEsParaAccionDesdeFormularioGrupoClienteFormaPago(Boolean esParaAccionDesdeFormularioGrupoClienteFormaPago) {
		this.esParaAccionDesdeFormularioGrupoClienteFormaPago = esParaAccionDesdeFormularioGrupoClienteFormaPago;
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

			if(this.grupoclienteformapagoSessionBean==null) {
				this.grupoclienteformapagoSessionBean=new GrupoClienteFormaPagoSessionBean();
			}

			if(!this.grupoclienteformapagoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(grupoclienteformapagoSessionBean.getlidEmpresaActual());
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

	public void cargarCombosGrupoClientesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.grupoclientesForeignKey=new ArrayList<GrupoCliente>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			GrupoClienteLogic grupoclienteLogic=new GrupoClienteLogic();

			//grupoclienteLogic.getGrupoClienteDataAccess().setIsForForeingKeyData(true);

			if(this.grupoclienteformapagoSessionBean==null) {
				this.grupoclienteformapagoSessionBean=new GrupoClienteFormaPagoSessionBean();
			}

			if(!this.grupoclienteformapagoSessionBean.getisBusquedaDesdeForeignKeySesionGrupoCliente()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//grupoclienteLogic.getGrupoClienteDataAccess().setIsForForeingKeyData(true);

					grupoclienteLogic.getTodosGrupoClientesWithConnection(sFinalQuery,new Pagination());

					this.grupoclientesForeignKey=grupoclienteLogic.getGrupoClientes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaGrupoCliente(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupoclienteLogic.getEntityWithConnection(grupoclienteformapagoSessionBean.getlidGrupoClienteActual());
					this.grupoclientesForeignKey.add(grupoclienteLogic.getGrupoCliente());
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

	public void cargarCombosTipoFormaPagosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoformapagosForeignKey=new ArrayList<TipoFormaPago>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoFormaPagoLogic tipoformapagoLogic=new TipoFormaPagoLogic();

			//tipoformapagoLogic.getTipoFormaPagoDataAccess().setIsForForeingKeyData(true);

			if(this.grupoclienteformapagoSessionBean==null) {
				this.grupoclienteformapagoSessionBean=new GrupoClienteFormaPagoSessionBean();
			}

			if(!this.grupoclienteformapagoSessionBean.getisBusquedaDesdeForeignKeySesionTipoFormaPago()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipoformapagoLogic.getTipoFormaPagoDataAccess().setIsForForeingKeyData(true);

					tipoformapagoLogic.getTodosTipoFormaPagosWithConnection(sFinalQuery,new Pagination());

					this.tipoformapagosForeignKey=tipoformapagoLogic.getTipoFormaPagos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoFormaPago(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoformapagoLogic.getEntityWithConnection(grupoclienteformapagoSessionBean.getlidTipoFormaPagoActual());
					this.tipoformapagosForeignKey.add(tipoformapagoLogic.getTipoFormaPago());
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

					if(this.grupoclienteformapago!=null) {
						this.grupoclienteformapago.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) {
						this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_empresaGrupoClienteFormaPago.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaGrupoClienteFormaPago.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) {
						if(this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_empresaGrupoClienteFormaPago.getItemCount()>0) {
							this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_empresaGrupoClienteFormaPago.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaGrupoClienteFormaPagoGenerico)throws Exception
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
				jComboBoxid_empresaGrupoClienteFormaPagoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaGrupoClienteFormaPagoGenerico!=null && jComboBoxid_empresaGrupoClienteFormaPagoGenerico.getItemCount()>0) {
					jComboBoxid_empresaGrupoClienteFormaPagoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualGrupoClienteForeignKey(Long idGrupoClienteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			GrupoCliente  grupoclienteTemp=null;

			for(GrupoCliente grupoclienteAux:grupoclientesForeignKey) {
				if(grupoclienteAux.getId()!=null && grupoclienteAux.getId().equals(idGrupoClienteSeleccionado)) {
					grupoclienteTemp=grupoclienteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(grupoclienteTemp!=null) {

					if(this.grupoclienteformapago!=null) {
						this.grupoclienteformapago.setGrupoCliente(grupoclienteTemp);
					}

					if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) {
						this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_grupo_clienteGrupoClienteFormaPago.setSelectedItem(grupoclienteTemp);
					}
				} else {
					//jComboBoxid_grupo_clienteGrupoClienteFormaPago.setSelectedItem(grupoclienteTemp);
					if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) {
						if(this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_grupo_clienteGrupoClienteFormaPago.getItemCount()>0) {
							this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_grupo_clienteGrupoClienteFormaPago.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdGrupoCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(grupoclienteTemp!=null && jComboBoxid_grupo_clienteFK_IdGrupoClienteGrupoClienteFormaPago!=null) {
						jComboBoxid_grupo_clienteFK_IdGrupoClienteGrupoClienteFormaPago.setSelectedItem(grupoclienteTemp);
					} else {
						if(jComboBoxid_grupo_clienteFK_IdGrupoClienteGrupoClienteFormaPago!=null) {
							//jComboBoxid_grupo_clienteFK_IdGrupoClienteGrupoClienteFormaPago.setSelectedItem(grupoclienteTemp);
							if(jComboBoxid_grupo_clienteFK_IdGrupoClienteGrupoClienteFormaPago.getItemCount()>0) {
								jComboBoxid_grupo_clienteFK_IdGrupoClienteGrupoClienteFormaPago.setSelectedIndex(0);
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

	public String getActualGrupoClienteForeignKeyDescripcion(Long idGrupoClienteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			GrupoCliente  grupoclienteTemp=null;

			for(GrupoCliente grupoclienteAux:grupoclientesForeignKey) {
				if(grupoclienteAux.getId()!=null && grupoclienteAux.getId().equals(idGrupoClienteSeleccionado)) {
					grupoclienteTemp=grupoclienteAux;
					break;
				}
			}


			sDescripcion=GrupoClienteConstantesFunciones.getGrupoClienteDescripcion(grupoclienteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualGrupoClienteForeignKeyGenerico(Long idGrupoClienteSeleccionado,JComboBox jComboBoxid_grupo_clienteGrupoClienteFormaPagoGenerico)throws Exception
	{
		try
		{
			GrupoCliente  grupoclienteTemp=null;

			for(GrupoCliente grupoclienteAux:grupoclientesForeignKey) {
				if(grupoclienteAux.getId()!=null && grupoclienteAux.getId().equals(idGrupoClienteSeleccionado)) {
					grupoclienteTemp=grupoclienteAux;
					break;
				}
			}

			if(grupoclienteTemp!=null) {
				jComboBoxid_grupo_clienteGrupoClienteFormaPagoGenerico.setSelectedItem(grupoclienteTemp);
			} else {
				if(jComboBoxid_grupo_clienteGrupoClienteFormaPagoGenerico!=null && jComboBoxid_grupo_clienteGrupoClienteFormaPagoGenerico.getItemCount()>0) {
					jComboBoxid_grupo_clienteGrupoClienteFormaPagoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoFormaPagoForeignKey(Long idTipoFormaPagoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoFormaPago  tipoformapagoTemp=null;

			for(TipoFormaPago tipoformapagoAux:tipoformapagosForeignKey) {
				if(tipoformapagoAux.getId()!=null && tipoformapagoAux.getId().equals(idTipoFormaPagoSeleccionado)) {
					tipoformapagoTemp=tipoformapagoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoformapagoTemp!=null) {

					if(this.grupoclienteformapago!=null) {
						this.grupoclienteformapago.setTipoFormaPago(tipoformapagoTemp);
					}

					if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) {
						this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_tipo_forma_pagoGrupoClienteFormaPago.setSelectedItem(tipoformapagoTemp);
					}
				} else {
					//jComboBoxid_tipo_forma_pagoGrupoClienteFormaPago.setSelectedItem(tipoformapagoTemp);
					if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) {
						if(this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_tipo_forma_pagoGrupoClienteFormaPago.getItemCount()>0) {
							this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_tipo_forma_pagoGrupoClienteFormaPago.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoFormaPago") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoformapagoTemp!=null && jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoGrupoClienteFormaPago!=null) {
						jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoGrupoClienteFormaPago.setSelectedItem(tipoformapagoTemp);
					} else {
						if(jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoGrupoClienteFormaPago!=null) {
							//jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoGrupoClienteFormaPago.setSelectedItem(tipoformapagoTemp);
							if(jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoGrupoClienteFormaPago.getItemCount()>0) {
								jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoGrupoClienteFormaPago.setSelectedIndex(0);
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

	public String getActualTipoFormaPagoForeignKeyDescripcion(Long idTipoFormaPagoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoFormaPago  tipoformapagoTemp=null;

			for(TipoFormaPago tipoformapagoAux:tipoformapagosForeignKey) {
				if(tipoformapagoAux.getId()!=null && tipoformapagoAux.getId().equals(idTipoFormaPagoSeleccionado)) {
					tipoformapagoTemp=tipoformapagoAux;
					break;
				}
			}


			sDescripcion=TipoFormaPagoConstantesFunciones.getTipoFormaPagoDescripcion(tipoformapagoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoFormaPagoForeignKeyGenerico(Long idTipoFormaPagoSeleccionado,JComboBox jComboBoxid_tipo_forma_pagoGrupoClienteFormaPagoGenerico)throws Exception
	{
		try
		{
			TipoFormaPago  tipoformapagoTemp=null;

			for(TipoFormaPago tipoformapagoAux:tipoformapagosForeignKey) {
				if(tipoformapagoAux.getId()!=null && tipoformapagoAux.getId().equals(idTipoFormaPagoSeleccionado)) {
					tipoformapagoTemp=tipoformapagoAux;
					break;
				}
			}

			if(tipoformapagoTemp!=null) {
				jComboBoxid_tipo_forma_pagoGrupoClienteFormaPagoGenerico.setSelectedItem(tipoformapagoTemp);
			} else {
				if(jComboBoxid_tipo_forma_pagoGrupoClienteFormaPagoGenerico!=null && jComboBoxid_tipo_forma_pagoGrupoClienteFormaPagoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_forma_pagoGrupoClienteFormaPagoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(GrupoClienteFormaPago grupoclienteformapago,JComboBox jComboBoxid_empresaGrupoClienteFormaPagoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaGrupoClienteFormaPagoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_empresaGrupoClienteFormaPago.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaGrupoClienteFormaPagoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				grupoclienteformapago.setid_empresa(empresaAux.getId());
				grupoclienteformapago.setempresa_descripcion(GrupoClienteFormaPagoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				grupoclienteformapago.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarGrupoClienteForeignKey(GrupoClienteFormaPago grupoclienteformapago,JComboBox jComboBoxid_grupo_clienteGrupoClienteFormaPagoGenerico)throws Exception
	{
		try
		{
			GrupoCliente  grupoclienteAux=new GrupoCliente();

			if(jComboBoxid_grupo_clienteGrupoClienteFormaPagoGenerico==null) {
				grupoclienteAux=(GrupoCliente)this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_grupo_clienteGrupoClienteFormaPago.getSelectedItem();
			} else {
				grupoclienteAux=(GrupoCliente)jComboBoxid_grupo_clienteGrupoClienteFormaPagoGenerico.getSelectedItem();
			}

			if(grupoclienteAux!=null && grupoclienteAux.getId()!=null) {
				grupoclienteformapago.setid_grupo_cliente(grupoclienteAux.getId());
				grupoclienteformapago.setgrupocliente_descripcion(GrupoClienteFormaPagoConstantesFunciones.getGrupoClienteDescripcion(grupoclienteAux));
				grupoclienteformapago.setGrupoCliente(grupoclienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoFormaPagoForeignKey(GrupoClienteFormaPago grupoclienteformapago,JComboBox jComboBoxid_tipo_forma_pagoGrupoClienteFormaPagoGenerico)throws Exception
	{
		try
		{
			TipoFormaPago  tipoformapagoAux=new TipoFormaPago();

			if(jComboBoxid_tipo_forma_pagoGrupoClienteFormaPagoGenerico==null) {
				tipoformapagoAux=(TipoFormaPago)this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_tipo_forma_pagoGrupoClienteFormaPago.getSelectedItem();
			} else {
				tipoformapagoAux=(TipoFormaPago)jComboBoxid_tipo_forma_pagoGrupoClienteFormaPagoGenerico.getSelectedItem();
			}

			if(tipoformapagoAux!=null && tipoformapagoAux.getId()!=null) {
				grupoclienteformapago.setid_tipo_forma_pago(tipoformapagoAux.getId());
				grupoclienteformapago.settipoformapago_descripcion(GrupoClienteFormaPagoConstantesFunciones.getTipoFormaPagoDescripcion(tipoformapagoAux));
				grupoclienteformapago.setTipoFormaPago(tipoformapagoAux);			}
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

					if(!GrupoClienteFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) { 
							this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_empresaGrupoClienteFormaPago.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_empresaGrupoClienteFormaPago.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) { 
					}

					if(!GrupoClienteFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameGrupoClientesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingGrupoCliente=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!GrupoClienteFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) { 
							this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_grupo_clienteGrupoClienteFormaPago.removeAllItems();

							for(GrupoCliente grupocliente:this.grupoclientesForeignKey) {
								this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_grupo_clienteGrupoClienteFormaPago.addItem(grupocliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) { 
					}

					if(!GrupoClienteFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdGrupoCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!GrupoClienteFormaPagoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_grupo_clienteFK_IdGrupoClienteGrupoClienteFormaPago.removeAllItems();

							for(GrupoCliente grupocliente:this.grupoclientesForeignKey) {
								this.jComboBoxid_grupo_clienteFK_IdGrupoClienteGrupoClienteFormaPago.addItem(grupocliente);
							}
						}

						if(!GrupoClienteFormaPagoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoFormaPagosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoFormaPago=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!GrupoClienteFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) { 
							this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_tipo_forma_pagoGrupoClienteFormaPago.removeAllItems();

							for(TipoFormaPago tipoformapago:this.tipoformapagosForeignKey) {
								this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_tipo_forma_pagoGrupoClienteFormaPago.addItem(tipoformapago);
							}
						}
					}

					if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) { 
					}

					if(!GrupoClienteFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoFormaPago") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!GrupoClienteFormaPagoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoGrupoClienteFormaPago.removeAllItems();

							for(TipoFormaPago tipoformapago:this.tipoformapagosForeignKey) {
								this.jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoGrupoClienteFormaPago.addItem(tipoformapago);
							}
						}

						if(!GrupoClienteFormaPagoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) {
							this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_empresaGrupoClienteFormaPago.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) {
							this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_empresaGrupoClienteFormaPago.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameGrupoClienteForeignKey(GrupoCliente grupocliente,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) {
							this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_grupo_clienteGrupoClienteFormaPago.setSelectedItem(grupocliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) {
							this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_grupo_clienteGrupoClienteFormaPago.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_grupo_clienteFK_IdGrupoClienteGrupoClienteFormaPago.setSelectedItem(grupocliente);
						} else {
							this.jComboBoxid_grupo_clienteFK_IdGrupoClienteGrupoClienteFormaPago.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoFormaPagoForeignKey(TipoFormaPago tipoformapago,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) {
							this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_tipo_forma_pagoGrupoClienteFormaPago.setSelectedItem(tipoformapago);
						}
					} else {
						if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) {
							this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_tipo_forma_pagoGrupoClienteFormaPago.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoGrupoClienteFormaPago.setSelectedItem(tipoformapago);
						} else {
							this.jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoGrupoClienteFormaPago.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesGrupoClienteFormaPago() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			GrupoClienteFormaPagoConstantesFunciones.refrescarForeignKeysDescripcionesGrupoClienteFormaPago(this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			GrupoClienteFormaPagoConstantesFunciones.refrescarForeignKeysDescripcionesGrupoClienteFormaPago(this.grupoclienteformapagos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(GrupoCliente.class));
		classes.add(new Classe(TipoFormaPago.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//grupoclienteformapagoLogic.setGrupoClienteFormaPagos(this.grupoclienteformapagos);
			grupoclienteformapagoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public GrupoClienteFormaPagoParameterReturnGeneral getGrupoClienteFormaPagoParameterGeneral() {
		return this.grupoclienteformapagoParameterGeneral;
	}
	
	public void setGrupoClienteFormaPagoParameterGeneral(GrupoClienteFormaPagoParameterReturnGeneral grupoclienteformapagoParameterGeneral) {
		this.grupoclienteformapagoParameterGeneral = grupoclienteformapagoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoGrupoClienteFormaPago() {
		return isPermisoTodoGrupoClienteFormaPago;
	}

	public void setIsPermisoTodoGrupoClienteFormaPago(Boolean isPermisoTodoGrupoClienteFormaPago) {
		this.isPermisoTodoGrupoClienteFormaPago = isPermisoTodoGrupoClienteFormaPago;
	}

	public Boolean getIsPermisoNuevoGrupoClienteFormaPago() {
		return isPermisoNuevoGrupoClienteFormaPago;
	}

	public void setIsPermisoNuevoGrupoClienteFormaPago(Boolean isPermisoNuevoGrupoClienteFormaPago) {
		this.isPermisoNuevoGrupoClienteFormaPago = isPermisoNuevoGrupoClienteFormaPago;
	}

	public Boolean getIsPermisoActualizarGrupoClienteFormaPago() {
		return isPermisoActualizarGrupoClienteFormaPago;
	}

	public void setIsPermisoActualizarGrupoClienteFormaPago(Boolean isPermisoActualizarGrupoClienteFormaPago) {
		this.isPermisoActualizarGrupoClienteFormaPago = isPermisoActualizarGrupoClienteFormaPago;
	}

	public Boolean getIsPermisoEliminarGrupoClienteFormaPago() {
		return isPermisoEliminarGrupoClienteFormaPago;
	}

	public void setIsPermisoEliminarGrupoClienteFormaPago(Boolean isPermisoEliminarGrupoClienteFormaPago) {
		this.isPermisoEliminarGrupoClienteFormaPago = isPermisoEliminarGrupoClienteFormaPago;
	}

	public Boolean getIsPermisoGuardarCambiosGrupoClienteFormaPago() {
		return isPermisoGuardarCambiosGrupoClienteFormaPago;
	}

	public void setIsPermisoGuardarCambiosGrupoClienteFormaPago(Boolean isPermisoGuardarCambiosGrupoClienteFormaPago) {
		this.isPermisoGuardarCambiosGrupoClienteFormaPago = isPermisoGuardarCambiosGrupoClienteFormaPago;
	}
	
	public Boolean getIsPermisoConsultaGrupoClienteFormaPago() {
		return isPermisoConsultaGrupoClienteFormaPago;
	}

	public void setIsPermisoConsultaGrupoClienteFormaPago(Boolean isPermisoConsultaGrupoClienteFormaPago) {
		this.isPermisoConsultaGrupoClienteFormaPago = isPermisoConsultaGrupoClienteFormaPago;
	}

	public Boolean getIsPermisoBusquedaGrupoClienteFormaPago() {
		return isPermisoBusquedaGrupoClienteFormaPago;
	}

	public void setIsPermisoBusquedaGrupoClienteFormaPago(Boolean isPermisoBusquedaGrupoClienteFormaPago) {
		this.isPermisoBusquedaGrupoClienteFormaPago = isPermisoBusquedaGrupoClienteFormaPago;
	}

	public Boolean getIsPermisoReporteGrupoClienteFormaPago() {
		return isPermisoReporteGrupoClienteFormaPago;
	}

	public void setIsPermisoReporteGrupoClienteFormaPago(Boolean isPermisoReporteGrupoClienteFormaPago) {
		this.isPermisoReporteGrupoClienteFormaPago = isPermisoReporteGrupoClienteFormaPago;
	}
	
	public Boolean getIsPermisoPaginacionMedioGrupoClienteFormaPago() {
		return isPermisoPaginacionMedioGrupoClienteFormaPago;
	}

	public void setIsPermisoPaginacionMedioGrupoClienteFormaPago(Boolean isPermisoPaginacionMedioGrupoClienteFormaPago) {
		this.isPermisoPaginacionMedioGrupoClienteFormaPago = isPermisoPaginacionMedioGrupoClienteFormaPago;
	}
	
	public Boolean getIsPermisoPaginacionTodoGrupoClienteFormaPago() {
		return isPermisoPaginacionTodoGrupoClienteFormaPago;
	}

	public void setIsPermisoPaginacionTodoGrupoClienteFormaPago(Boolean isPermisoPaginacionTodoGrupoClienteFormaPago) {
		this.isPermisoPaginacionTodoGrupoClienteFormaPago = isPermisoPaginacionTodoGrupoClienteFormaPago;
	}
	
	public Boolean getIsPermisoPaginacionAltoGrupoClienteFormaPago() {
		return isPermisoPaginacionAltoGrupoClienteFormaPago;
	}

	public void setIsPermisoPaginacionAltoGrupoClienteFormaPago(Boolean isPermisoPaginacionAltoGrupoClienteFormaPago) {
		this.isPermisoPaginacionAltoGrupoClienteFormaPago = isPermisoPaginacionAltoGrupoClienteFormaPago;
	}
	
	public Boolean getIsPermisoCopiarGrupoClienteFormaPago() {
		return isPermisoCopiarGrupoClienteFormaPago;
	}

	public void setIsPermisoCopiarGrupoClienteFormaPago(Boolean isPermisoCopiarGrupoClienteFormaPago) {
		this.isPermisoCopiarGrupoClienteFormaPago = isPermisoCopiarGrupoClienteFormaPago;
	}
	
	public Boolean getIsPermisoVerFormGrupoClienteFormaPago() {
		return isPermisoVerFormGrupoClienteFormaPago;
	}

	public void setIsPermisoVerFormGrupoClienteFormaPago(Boolean isPermisoVerFormGrupoClienteFormaPago) {
		this.isPermisoVerFormGrupoClienteFormaPago = isPermisoVerFormGrupoClienteFormaPago;
	}
	
	public Boolean getIsPermisoDuplicarGrupoClienteFormaPago() {
		return isPermisoDuplicarGrupoClienteFormaPago;
	}

	public void setIsPermisoDuplicarGrupoClienteFormaPago(Boolean isPermisoDuplicarGrupoClienteFormaPago) {
		this.isPermisoDuplicarGrupoClienteFormaPago = isPermisoDuplicarGrupoClienteFormaPago;
	}
	
	public Boolean getIsPermisoOrdenGrupoClienteFormaPago() {
		return isPermisoOrdenGrupoClienteFormaPago;
	}

	public void setIsPermisoOrdenGrupoClienteFormaPago(Boolean isPermisoOrdenGrupoClienteFormaPago) {
		this.isPermisoOrdenGrupoClienteFormaPago = isPermisoOrdenGrupoClienteFormaPago;
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
	
	public Boolean getIsVisibilidadCeldaNuevoGrupoClienteFormaPago() {
		return isVisibilidadCeldaNuevoGrupoClienteFormaPago;
	}

	public void setIsVisibilidadCeldaNuevoGrupoClienteFormaPago(Boolean isVisibilidadCeldaNuevoGrupoClienteFormaPago) {
		this.isVisibilidadCeldaNuevoGrupoClienteFormaPago = isVisibilidadCeldaNuevoGrupoClienteFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarGrupoClienteFormaPago() {
		return isVisibilidadCeldaDuplicarGrupoClienteFormaPago;
	}

	public void setIsVisibilidadCeldaDuplicarGrupoClienteFormaPago(Boolean isVisibilidadCeldaDuplicarGrupoClienteFormaPago) {
		this.isVisibilidadCeldaDuplicarGrupoClienteFormaPago = isVisibilidadCeldaDuplicarGrupoClienteFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarGrupoClienteFormaPago() {
		return isVisibilidadCeldaCopiarGrupoClienteFormaPago;
	}

	public void setIsVisibilidadCeldaCopiarGrupoClienteFormaPago(Boolean isVisibilidadCeldaCopiarGrupoClienteFormaPago) {
		this.isVisibilidadCeldaCopiarGrupoClienteFormaPago = isVisibilidadCeldaCopiarGrupoClienteFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormGrupoClienteFormaPago() {
		return isVisibilidadCeldaVerFormGrupoClienteFormaPago;
	}

	public void setIsVisibilidadCeldaVerFormGrupoClienteFormaPago(Boolean isVisibilidadCeldaVerFormGrupoClienteFormaPago) {
		this.isVisibilidadCeldaVerFormGrupoClienteFormaPago = isVisibilidadCeldaVerFormGrupoClienteFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenGrupoClienteFormaPago() {
		return isVisibilidadCeldaOrdenGrupoClienteFormaPago;
	}

	public void setIsVisibilidadCeldaOrdenGrupoClienteFormaPago(Boolean isVisibilidadCeldaOrdenGrupoClienteFormaPago) {
		this.isVisibilidadCeldaOrdenGrupoClienteFormaPago = isVisibilidadCeldaOrdenGrupoClienteFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesGrupoClienteFormaPago() {
		return isVisibilidadCeldaNuevoRelacionesGrupoClienteFormaPago;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesGrupoClienteFormaPago(Boolean isVisibilidadCeldaNuevoRelacionesGrupoClienteFormaPago) {
		this.isVisibilidadCeldaNuevoRelacionesGrupoClienteFormaPago = isVisibilidadCeldaNuevoRelacionesGrupoClienteFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaModificarGrupoClienteFormaPago() {
		return isVisibilidadCeldaModificarGrupoClienteFormaPago;
	}

	public void setIsVisibilidadCeldaModificarGrupoClienteFormaPago(Boolean isVisibilidadCeldaModificarGrupoClienteFormaPago) {
		this.isVisibilidadCeldaModificarGrupoClienteFormaPago = isVisibilidadCeldaModificarGrupoClienteFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarGrupoClienteFormaPago() {
		return isVisibilidadCeldaActualizarGrupoClienteFormaPago;
	}

	public void setIsVisibilidadCeldaActualizarGrupoClienteFormaPago(Boolean isVisibilidadCeldaActualizarGrupoClienteFormaPago) {
		this.isVisibilidadCeldaActualizarGrupoClienteFormaPago = isVisibilidadCeldaActualizarGrupoClienteFormaPago;
	}

	public Boolean getIsVisibilidadCeldaEliminarGrupoClienteFormaPago() {
		return isVisibilidadCeldaEliminarGrupoClienteFormaPago;
	}

	public void setIsVisibilidadCeldaEliminarGrupoClienteFormaPago(Boolean isVisibilidadCeldaEliminarGrupoClienteFormaPago) {
		this.isVisibilidadCeldaEliminarGrupoClienteFormaPago = isVisibilidadCeldaEliminarGrupoClienteFormaPago;
	}

	public Boolean getIsVisibilidadCeldaCancelarGrupoClienteFormaPago() {
		return isVisibilidadCeldaCancelarGrupoClienteFormaPago;
	}

	public void setIsVisibilidadCeldaCancelarGrupoClienteFormaPago(Boolean isVisibilidadCeldaCancelarGrupoClienteFormaPago) {
		this.isVisibilidadCeldaCancelarGrupoClienteFormaPago = isVisibilidadCeldaCancelarGrupoClienteFormaPago;
	}

	public Boolean getIsVisibilidadCeldaGuardarGrupoClienteFormaPago() {
		return isVisibilidadCeldaGuardarGrupoClienteFormaPago;
	}

	public void setIsVisibilidadCeldaGuardarGrupoClienteFormaPago(Boolean isVisibilidadCeldaGuardarGrupoClienteFormaPago) {
		this.isVisibilidadCeldaGuardarGrupoClienteFormaPago = isVisibilidadCeldaGuardarGrupoClienteFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosGrupoClienteFormaPago() {
		return isVisibilidadCeldaGuardarCambiosGrupoClienteFormaPago;
	}

	public void setIsVisibilidadCeldaGuardarCambiosGrupoClienteFormaPago(Boolean isVisibilidadCeldaGuardarCambiosGrupoClienteFormaPago) {
		this.isVisibilidadCeldaGuardarCambiosGrupoClienteFormaPago = isVisibilidadCeldaGuardarCambiosGrupoClienteFormaPago;
	}
		
	public GrupoClienteFormaPagoSessionBean getgrupoclienteformapagoSessionBean() {
		return this.grupoclienteformapagoSessionBean;
	}
	
	public void setgrupoclienteformapagoSessionBean(GrupoClienteFormaPagoSessionBean grupoclienteformapagoSessionBean) {
		this.grupoclienteformapagoSessionBean=grupoclienteformapagoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdGrupoCliente() {
		return this.isVisibilidadFK_IdGrupoCliente;
	}

	public void setisVisibilidadFK_IdGrupoCliente(Boolean isVisibilidadFK_IdGrupoCliente) {
		this.isVisibilidadFK_IdGrupoCliente=isVisibilidadFK_IdGrupoCliente;
	}

	public Boolean getisVisibilidadFK_IdTipoFormaPago() {
		return this.isVisibilidadFK_IdTipoFormaPago;
	}

	public void setisVisibilidadFK_IdTipoFormaPago(Boolean isVisibilidadFK_IdTipoFormaPago) {
		this.isVisibilidadFK_IdTipoFormaPago=isVisibilidadFK_IdTipoFormaPago;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysGrupoClienteFormaPago(GrupoClienteFormaPago grupoclienteformapago)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(grupoclienteformapago,null);
				this.setActualParaGuardarGrupoClienteForeignKey(grupoclienteformapago,null);
				this.setActualParaGuardarTipoFormaPagoForeignKey(grupoclienteformapago,null);
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
	
	public void bugActualizarReferenciaActual(GrupoClienteFormaPago grupoclienteformapago,GrupoClienteFormaPago grupoclienteformapagoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalGrupoClienteFormaPago(grupoclienteformapago);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		grupoclienteformapagoAux.setId(grupoclienteformapago.getId());
		grupoclienteformapagoAux.setVersionRow(grupoclienteformapago.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessGrupoClienteFormaPago();
		
			int intSelectedRow = this.jTableDatosGrupoClienteFormaPago.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteformapago =(GrupoClienteFormaPago) this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.grupoclienteformapago =(GrupoClienteFormaPago) this.grupoclienteformapagos.toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(GrupoClienteFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualGrupoClienteFormaPago(this.grupoclienteformapago,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysGrupoClienteFormaPago(this.grupoclienteformapago);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = grupoclienteformapagoValidator.getInvalidValues(this.grupoclienteformapago);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			grupoclienteformapagoLogic.setDatosCliente(datosCliente);
			grupoclienteformapagoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				grupoclienteformapagoAux=new  GrupoClienteFormaPago();
				
				grupoclienteformapagoAux.setIsNew(true);
				grupoclienteformapagoAux.setIsChanged(true);
				
				grupoclienteformapagoAux.setGrupoClienteFormaPagoOriginal(this.grupoclienteformapago);
				
				grupoclienteformapagoAux.setId(this.grupoclienteformapago.getId());	
				grupoclienteformapagoAux.setVersionRow(this.grupoclienteformapago.getVersionRow());	
				grupoclienteformapagoAux.setid_empresa(this.grupoclienteformapago.getid_empresa());	
				grupoclienteformapagoAux.setid_grupo_cliente(this.grupoclienteformapago.getid_grupo_cliente());	
				grupoclienteformapagoAux.setid_tipo_forma_pago(this.grupoclienteformapago.getid_tipo_forma_pago());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.grupoclienteformapagoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(grupoclienteformapagoAux,grupoclienteformapagoLogic.getGrupoClienteFormaPagos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(grupoclienteformapagoAux,grupoclienteformapagos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.grupoclienteformapagoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoclienteformapagoLogic.saveGrupoClienteFormaPagos();//WithConnection
						//grupoclienteformapagoLogic.getSetVersionRowGrupoClienteFormaPagos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.grupoclienteformapago,grupoclienteformapagoAux);
					
					this.refrescarForeignKeysDescripcionesGrupoClienteFormaPago();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.grupoclienteformapagoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								grupoclienteformapagoLogic.saveGrupoClienteFormaPagoRelaciones(grupoclienteformapagoAux);//WithConnection
								//grupoclienteformapagoLogic.getSetVersionRowGrupoClienteFormaPagos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.grupoclienteformapago,grupoclienteformapagoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.grupoclienteformapagoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(grupoclienteformapagoAux,grupoclienteformapagoLogic.getGrupoClienteFormaPagos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(grupoclienteformapagoAux,grupoclienteformapagos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.grupoclienteformapago,grupoclienteformapagoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				grupoclienteformapagoAux=new  GrupoClienteFormaPago();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado() 
					|| (this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado() && this.grupoclienteformapago.getId()>=0)) {
						
					grupoclienteformapagoAux.setIsNew(false);
				}
				
				grupoclienteformapagoAux.setIsDeleted(false);
			
				grupoclienteformapagoAux.setId(this.grupoclienteformapago.getId());	
				grupoclienteformapagoAux.setVersionRow(this.grupoclienteformapago.getVersionRow());	
				grupoclienteformapagoAux.setid_empresa(this.grupoclienteformapago.getid_empresa());	
				grupoclienteformapagoAux.setid_grupo_cliente(this.grupoclienteformapago.getid_grupo_cliente());	
				grupoclienteformapagoAux.setid_tipo_forma_pago(this.grupoclienteformapago.getid_tipo_forma_pago());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(grupoclienteformapagoAux,grupoclienteformapagoLogic.getGrupoClienteFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(grupoclienteformapagoAux,grupoclienteformapagos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.grupoclienteformapagoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoclienteformapagoLogic.saveGrupoClienteFormaPagos();//WithConnection
						//grupoclienteformapagoLogic.getSetVersionRowGrupoClienteFormaPagos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.grupoclienteformapago,grupoclienteformapagoAux);
					
					this.refrescarForeignKeysDescripcionesGrupoClienteFormaPago();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.grupoclienteformapagoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								grupoclienteformapagoLogic.saveGrupoClienteFormaPagoRelaciones(grupoclienteformapagoAux);//WithConnection
								//grupoclienteformapagoLogic.getSetVersionRowGrupoClienteFormaPagos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.grupoclienteformapago,grupoclienteformapagoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.grupoclienteformapagoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(grupoclienteformapagoAux,grupoclienteformapagoLogic.getGrupoClienteFormaPagos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(grupoclienteformapagoAux,grupoclienteformapagos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.grupoclienteformapago,grupoclienteformapagoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				grupoclienteformapagoAux=new  GrupoClienteFormaPago();
				
				grupoclienteformapagoAux.setIsNew(false);
				grupoclienteformapagoAux.setIsChanged(false);
				
				grupoclienteformapagoAux.setIsDeleted(true);
				
				grupoclienteformapagoAux.setId(this.grupoclienteformapago.getId());	
				grupoclienteformapagoAux.setVersionRow(this.grupoclienteformapago.getVersionRow());	
				grupoclienteformapagoAux.setid_empresa(this.grupoclienteformapago.getid_empresa());	
				grupoclienteformapagoAux.setid_grupo_cliente(this.grupoclienteformapago.getid_grupo_cliente());	
				grupoclienteformapagoAux.setid_tipo_forma_pago(this.grupoclienteformapago.getid_tipo_forma_pago());	
				
				if(this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.grupoclienteformapagoAux.getId()>=0) {	
						this.grupoclienteformapagosEliminados.add(grupoclienteformapagoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(grupoclienteformapagoAux,grupoclienteformapagoLogic.getGrupoClienteFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(grupoclienteformapagoAux,grupoclienteformapagos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.grupoclienteformapagoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoclienteformapagoLogic.saveGrupoClienteFormaPagos();//WithConnection
						//grupoclienteformapagoLogic.getSetVersionRowGrupoClienteFormaPagos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.grupoclienteformapagoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								grupoclienteformapagoLogic.saveGrupoClienteFormaPagoRelaciones(grupoclienteformapagoAux);//WithConnection
								//grupoclienteformapagoLogic.getSetVersionRowGrupoClienteFormaPagos();//WithConnection
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
							if(this.grupoclienteformapagoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(grupoclienteformapagoAux,grupoclienteformapagoLogic.getGrupoClienteFormaPagos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(grupoclienteformapagoAux,grupoclienteformapagos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().addAll(this.grupoclienteformapagosEliminados);
					
					grupoclienteformapagoLogic.saveGrupoClienteFormaPagos();//WithConnection
					//grupoclienteformapagoLogic.getSetVersionRowGrupoClienteFormaPagos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesGrupoClienteFormaPago();
				
				this.grupoclienteformapagosEliminados= new ArrayList<GrupoClienteFormaPago>();		
			}
			
			if(this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Grupo Cliente Forma Pago GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Grupo Cliente Forma Pago",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.grupoclienteformapago=grupoclienteformapagoAux;
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
      		//this.finishProcessGrupoClienteFormaPago();
      	}
		
	}	
	
	public void actualizarRelaciones(GrupoClienteFormaPago grupoclienteformapagoLocal) throws Exception {
		
		if(this.grupoclienteformapagoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(GrupoClienteFormaPago grupoclienteformapagoLocal) throws Exception {	
		if(this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				grupoclienteformapagoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(GrupoClienteDetalleFormJInternalFrame.class)) {
				GrupoClienteBeanSwingJInternalFrame grupoclienteBeanSwingJInternalFrameLocal=(GrupoClienteBeanSwingJInternalFrame) ((GrupoClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				grupoclienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoGrupoCliente(grupoclienteBeanSwingJInternalFrameLocal.getgrupocliente(),true);
				grupoclienteBeanSwingJInternalFrameLocal.actualizarLista(grupoclienteBeanSwingJInternalFrameLocal.grupocliente,this.grupoclientesForeignKey);

				grupoclienteBeanSwingJInternalFrameLocal.actualizarRelaciones(grupoclienteBeanSwingJInternalFrameLocal.grupocliente);

				grupoclienteformapagoLocal.setGrupoCliente(grupoclienteBeanSwingJInternalFrameLocal.grupocliente);

				this.addItemDefectoCombosForeignKeyGrupoCliente();
				this.cargarCombosFrameGrupoClientesForeignKey("Formulario");
				this.setActualGrupoClienteForeignKey(grupoclienteBeanSwingJInternalFrameLocal.grupocliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoFormaPagoDetalleFormJInternalFrame.class)) {
				TipoFormaPagoBeanSwingJInternalFrame tipoformapagoBeanSwingJInternalFrameLocal=(TipoFormaPagoBeanSwingJInternalFrame) ((TipoFormaPagoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoformapagoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoFormaPago(tipoformapagoBeanSwingJInternalFrameLocal.gettipoformapago(),true);
				tipoformapagoBeanSwingJInternalFrameLocal.actualizarLista(tipoformapagoBeanSwingJInternalFrameLocal.tipoformapago,this.tipoformapagosForeignKey);

				tipoformapagoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoformapagoBeanSwingJInternalFrameLocal.tipoformapago);

				grupoclienteformapagoLocal.setTipoFormaPago(tipoformapagoBeanSwingJInternalFrameLocal.tipoformapago);

				this.addItemDefectoCombosForeignKeyTipoFormaPago();
				this.cargarCombosFrameTipoFormaPagosForeignKey("Formulario");
				this.setActualTipoFormaPagoForeignKey(tipoformapagoBeanSwingJInternalFrameLocal.tipoformapago.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarGrupoClienteFormaPagoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosGrupoClienteFormaPago.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.grupoclienteformapago =(GrupoClienteFormaPago) this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.grupoclienteformapago =(GrupoClienteFormaPago) this.grupoclienteformapagos.toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = grupoclienteformapagoValidator.getInvalidValues(this.grupoclienteformapago);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(GrupoClienteFormaPago grupoclienteformapago,List<GrupoClienteFormaPago> grupoclienteformapagos) throws Exception {
		try	{		
			GrupoClienteFormaPagoConstantesFunciones.actualizarLista(grupoclienteformapago,grupoclienteformapagos,this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(GrupoClienteFormaPago grupoclienteformapago,List<GrupoClienteFormaPago> grupoclienteformapagos) throws Exception {
		try	{			
			GrupoClienteFormaPagoConstantesFunciones.actualizarSelectedLista(grupoclienteformapago,grupoclienteformapagos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<GrupoClienteFormaPago> grupoclienteformapagosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				grupoclienteformapagosLocal=this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				grupoclienteformapagosLocal=this.grupoclienteformapagos;
			}
			//ARCHITECTURE
		
			for(GrupoClienteFormaPago grupoclienteformapagoLocal:grupoclienteformapagosLocal) {
				if(this.permiteMantenimiento(grupoclienteformapagoLocal) && grupoclienteformapagoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+GrupoClienteFormaPagoConstantesFunciones.getGrupoClienteFormaPagoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(GrupoClienteFormaPagoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGrupoClienteFormaPago.jLabelid_empresaGrupoClienteFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GrupoClienteFormaPagoConstantesFunciones.IDGRUPOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGrupoClienteFormaPago.jLabelid_grupo_clienteGrupoClienteFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GrupoClienteFormaPagoConstantesFunciones.IDTIPOFORMAPAGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGrupoClienteFormaPago.jLabelid_tipo_forma_pagoGrupoClienteFormaPago,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGrupoClienteFormaPago.jLabelid_empresaGrupoClienteFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGrupoClienteFormaPago.jLabelid_grupo_clienteGrupoClienteFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGrupoClienteFormaPago.jLabelid_tipo_forma_pagoGrupoClienteFormaPago,"");
		
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
		this.iIdNuevoGrupoClienteFormaPago--;	
		
		
		this.grupoclienteformapagoAux=new GrupoClienteFormaPago();
		
		this.grupoclienteformapagoAux.setId(this.iIdNuevoGrupoClienteFormaPago);
		this.grupoclienteformapagoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().add(this.grupoclienteformapagoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.grupoclienteformapagos.add(this.grupoclienteformapagoAux);
		}
		//ARCHITECTURE
		
		this.grupoclienteformapago=this.grupoclienteformapagoAux;
		
		if(GrupoClienteFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioGrupoClienteFormaPago(this.grupoclienteformapago);
			this.setVariablesObjetoActualToFormularioForeignKeyGrupoClienteFormaPago(this.grupoclienteformapago);
		}
				
		//this.setDefaultControlesGrupoClienteFormaPago();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyGrupoClienteFormaPago();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyGrupoClienteFormaPago();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyGrupoClienteFormaPago();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualGrupoClienteFormaPago(this.grupoclienteformapagoBean,this.grupoclienteformapago,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysGrupoClienteFormaPago(this.grupoclienteformapago);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.grupoclienteformapagoSessionBean.getConGuardarRelaciones()) {
			classes=GrupoClienteFormaPagoConstantesFunciones.getClassesRelationshipsOfGrupoClienteFormaPago(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.grupoclienteformapagoReturnGeneral=grupoclienteformapagoLogic.procesarEventosGrupoClienteFormaPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos(),this.grupoclienteformapago,this.grupoclienteformapagoParameterGeneral,this.isEsNuevoGrupoClienteFormaPago,classes);//this.grupoclienteformapagoLogic.getGrupoClienteFormaPago()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanGrupoClienteFormaPago(this.grupoclienteformapagoReturnGeneral,this.grupoclienteformapagoBean,false);
		
		if(this.grupoclienteformapagoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyGrupoClienteFormaPago(this.grupoclienteformapagoReturnGeneral.getGrupoClienteFormaPago());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioGrupoClienteFormaPago(this.grupoclienteformapagoReturnGeneral.getGrupoClienteFormaPago());
		}
		
		if(this.grupoclienteformapagoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioGrupoClienteFormaPago(this.grupoclienteformapagoReturnGeneral.getGrupoClienteFormaPago(),classes);//this.grupoclienteformapagoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualGrupoClienteFormaPago(this.grupoclienteformapago,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyGrupoClienteFormaPago();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyGrupoClienteFormaPago();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.RecargarFormGrupoClienteFormaPago(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingGrupoClienteFormaPago(false);
						
			if(grupoclienteformapagoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(GrupoClienteFormaPagoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualGrupoClienteFormaPago();
			}
			
			this.actualizarVisualTableDatosGrupoClienteFormaPago();
			
			this.jTableDatosGrupoClienteFormaPago.setRowSelectionInterval(this.getIndiceNuevoGrupoClienteFormaPago(), this.getIndiceNuevoGrupoClienteFormaPago());
			
			this.seleccionarFilaTablaGrupoClienteFormaPagoActual();
						
			this.actualizarEstadoCeldasBotonesGrupoClienteFormaPago("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesGrupoClienteFormaPago(Boolean isHabilitar) throws Exception {
			
		//
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_empresaGrupoClienteFormaPago.setEnabled(isHabilitar && this.grupoclienteformapagoConstantesFunciones.activarid_empresaGrupoClienteFormaPago);
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_grupo_clienteGrupoClienteFormaPago.setEnabled(isHabilitar && this.grupoclienteformapagoConstantesFunciones.activarid_grupo_clienteGrupoClienteFormaPago);
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_tipo_forma_pagoGrupoClienteFormaPago.setEnabled(isHabilitar && this.grupoclienteformapagoConstantesFunciones.activarid_tipo_forma_pagoGrupoClienteFormaPago);
	};
	
	public void setDefaultControlesGrupoClienteFormaPago() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoGrupoClienteFormaPago(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.grupoclienteformapagoSessionBean.setConGuardarRelaciones(true);			
			this.grupoclienteformapagoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.jTabbedPaneRelacionesGrupoClienteFormaPago.setVisible(true);
			
					
		} else {
			//this.grupoclienteformapagoSessionBean.setConGuardarRelaciones(false);			
			this.grupoclienteformapagoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.jTabbedPaneRelacionesGrupoClienteFormaPago.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoGrupoClienteFormaPago() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GrupoClienteFormaPago grupoclienteformapagoAux:this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos()) {
				if(grupoclienteformapagoAux.getId().equals(this.iIdNuevoGrupoClienteFormaPago)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GrupoClienteFormaPago grupoclienteformapagoAux:this.grupoclienteformapagos) {
				if(grupoclienteformapagoAux.getId().equals(this.iIdNuevoGrupoClienteFormaPago)) {
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
	
	public int getIndiceActualGrupoClienteFormaPago(GrupoClienteFormaPago grupoclienteformapago,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GrupoClienteFormaPago grupoclienteformapagoAux:this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos()) {
				if(grupoclienteformapagoAux.getId().equals(grupoclienteformapago.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GrupoClienteFormaPago grupoclienteformapagoAux:this.grupoclienteformapagos) {
				if(grupoclienteformapagoAux.getId().equals(grupoclienteformapago.getId())) {
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
	
	public void setCamposBaseDesdeOriginalGrupoClienteFormaPago(GrupoClienteFormaPago grupoclienteformapagoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GrupoClienteFormaPago grupoclienteformapagoAux:this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos()) {
				if(grupoclienteformapagoAux.getGrupoClienteFormaPagoOriginal().getId().equals(grupoclienteformapagoOriginal.getId())) {
					existe=true;
					grupoclienteformapagoOriginal.setId(grupoclienteformapagoAux.getId());
					grupoclienteformapagoOriginal.setVersionRow(grupoclienteformapagoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GrupoClienteFormaPago grupoclienteformapagoAux:this.grupoclienteformapagos) {
				if(grupoclienteformapagoAux.getGrupoClienteFormaPagoOriginal().getId().equals(grupoclienteformapagoOriginal.getId())) {
					existe=true;
					grupoclienteformapagoOriginal.setId(grupoclienteformapagoAux.getId());
					grupoclienteformapagoOriginal.setVersionRow(grupoclienteformapagoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosGrupoClienteFormaPago(Boolean esParaCancelar) throws Exception {
		grupoclienteformapagosAux=new ArrayList<GrupoClienteFormaPago>();
		grupoclienteformapagoAux=new GrupoClienteFormaPago();
		
		if(!this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(GrupoClienteFormaPago grupoclienteformapagoAux:this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos()) {
					if(grupoclienteformapagoAux.getId()<0) {
						grupoclienteformapagosAux.add(grupoclienteformapagoAux);
					}		
				}
				this.iIdNuevoGrupoClienteFormaPago=0L;
				this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().removeAll(grupoclienteformapagosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GrupoClienteFormaPago grupoclienteformapagoAux:this.grupoclienteformapagos) {
					if(grupoclienteformapagoAux.getId()<0) {
						grupoclienteformapagosAux.add(grupoclienteformapagoAux);
					}		
				}
				this.iIdNuevoGrupoClienteFormaPago=0L;
				this.grupoclienteformapagos.removeAll(grupoclienteformapagosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoGrupoClienteFormaPago 
					&& this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().size()>0
					) {
					grupoclienteformapagoAux=this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().get(this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().size() - 1);
				
					if(grupoclienteformapagoAux.getId()<0) {
						this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().remove(grupoclienteformapagoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoGrupoClienteFormaPago && this.grupoclienteformapagos.size()>0) {
					grupoclienteformapagoAux=this.grupoclienteformapagos.get(this.grupoclienteformapagos.size() - 1);
				
					if(grupoclienteformapagoAux.getId()<0) {
						this.grupoclienteformapagos.remove(grupoclienteformapagoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoGrupoClienteFormaPago(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(grupoclienteformapago.getId()<0) {
				this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().remove(this.grupoclienteformapago);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(grupoclienteformapago.getId()<0) {
				this.grupoclienteformapagos.remove(this.grupoclienteformapago);
			}
		}			
	}
	
	public void setEstadosInicialesGrupoClienteFormaPago(List<GrupoClienteFormaPago> grupoclienteformapagosAux) throws Exception {
		GrupoClienteFormaPagoConstantesFunciones.setEstadosInicialesGrupoClienteFormaPago(grupoclienteformapagosAux);
	}
	
	public void setEstadosInicialesGrupoClienteFormaPago(GrupoClienteFormaPago grupoclienteformapagoAux) throws Exception {
		GrupoClienteFormaPagoConstantesFunciones.setEstadosInicialesGrupoClienteFormaPago(grupoclienteformapagoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarGrupoClienteFormaPagoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesGrupoClienteFormaPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarGrupoClienteFormaPagoActual()) {
				if(!this.isEsNuevoGrupoClienteFormaPago) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesGrupoClienteFormaPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoGrupoClienteFormaPago=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarGrupoClienteFormaPagoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Grupo Cliente Forma Pago ?", "MANTENIMIENTO DE Grupo Cliente Forma Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesGrupoClienteFormaPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(GrupoClienteFormaPago grupoclienteformapago) throws Exception {
		GrupoClienteFormaPagoConstantesFunciones.seleccionarAsignar(this.grupoclienteformapago,grupoclienteformapago);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarGrupoClienteFormaPago=this.isPermisoActualizarOriginalGrupoClienteFormaPago;
			
			
			this.seleccionarAsignar(grupoclienteformapago);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			GrupoClienteFormaPagoConstantesFunciones.quitarEspaciosGrupoClienteFormaPago(this.grupoclienteformapago,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesGrupoClienteFormaPago("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.grupoclienteformapagoSessionBean.setsFuncionBusquedaRapida(this.grupoclienteformapagoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoGrupoClienteFormaPago) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosGrupoClienteFormaPago(esParaCancelar);				
				this.cancelarNuevoGrupoClienteFormaPago(esParaCancelar);								
			}
			
			this.grupoclienteformapago=new GrupoClienteFormaPago();
			
			this.inicializarGrupoClienteFormaPago();
			
			this.actualizarEstadoCeldasBotonesGrupoClienteFormaPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarGrupoClienteFormaPago() throws Exception {
		try {
			GrupoClienteFormaPagoConstantesFunciones.inicializarGrupoClienteFormaPago(this.grupoclienteformapago);
			
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
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteGrupoClienteFormaPagos(String sAccionBusqueda,List<GrupoClienteFormaPago> grupoclienteformapagosParaReportes) throws Exception {
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
					sPathReporteFinal="GrupoClienteFormaPago"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="GrupoClienteFormaPagoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("GrupoClienteFormaPagoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="GrupoClienteFormaPago"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Grupo Cliente Forma Pagos");		
		parameters.put("busquedapor", GrupoClienteFormaPagoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceGrupoClienteFormaPago=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			GrupoClienteFormaPagoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			GrupoClienteFormaPagoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceGrupoClienteFormaPago=new JRBeanArrayDataSource(GrupoClienteFormaPagoJInternalFrame.TraerGrupoClienteFormaPagoBeans(grupoclienteformapagosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceGrupoClienteFormaPago);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+GrupoClienteFormaPagoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+GrupoClienteFormaPagoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(GrupoClienteFormaPagoBean.TraerGrupoClienteFormaPagoBeans(grupoclienteformapagosParaReportes).toArray()));
							
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
				this.generarExcelReporteGrupoClienteFormaPagos(sAccionBusqueda,sTipoArchivoReporte,grupoclienteformapagosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalGrupoClienteFormaPagos(sAccionBusqueda,sTipoArchivoReporte,grupoclienteformapagosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoGrupoClienteFormaPagoActionPerformed(null);
					//this.generarExcelReporteGrupoClienteFormaPagos(sAccionBusqueda,sTipoArchivoReporte,grupoclienteformapagosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalGrupoClienteFormaPagos(sAccionBusqueda,sTipoArchivoReporte,grupoclienteformapagosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesGrupoClienteFormaPagos(sAccionBusqueda,sTipoArchivoReporte,grupoclienteformapagosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesGrupoClienteFormaPagos(sAccionBusqueda,sTipoArchivoReporte,grupoclienteformapagosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteGrupoClienteFormaPagos(String sAccionBusqueda,String sTipoArchivoReporte,List<GrupoClienteFormaPago> grupoclienteformapagosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"grupoclienteformapago";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("GrupoClienteFormaPagos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderGrupoClienteFormaPago("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(GrupoClienteFormaPago grupoclienteformapago : grupoclienteformapagosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			GrupoClienteFormaPagoConstantesFunciones.generarExcelReporteDataGrupoClienteFormaPago("NORMAL",row,workbook,grupoclienteformapago,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Grupo Cliente Forma Pago",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderGrupoClienteFormaPago(String sTipo,Row row,Workbook workbook) {
		
		GrupoClienteFormaPagoConstantesFunciones.generarExcelReporteHeaderGrupoClienteFormaPago(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalGrupoClienteFormaPagos(String sAccionBusqueda,String sTipoArchivoReporte,List<GrupoClienteFormaPago> grupoclienteformapagosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"grupoclienteformapago_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("GrupoClienteFormaPagos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(GrupoClienteFormaPago grupoclienteformapago : grupoclienteformapagosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(GrupoClienteFormaPagoConstantesFunciones.getGrupoClienteFormaPagoDescripcion(grupoclienteformapago));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GrupoClienteFormaPagoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GrupoClienteFormaPagoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(grupoclienteformapago.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GrupoClienteFormaPagoConstantesFunciones.LABEL_IDGRUPOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GrupoClienteFormaPagoConstantesFunciones.LABEL_IDGRUPOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(grupoclienteformapago.getgrupocliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GrupoClienteFormaPagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GrupoClienteFormaPagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(grupoclienteformapago.gettipoformapago_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Grupo Cliente Forma Pago",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesGrupoClienteFormaPagos(String sAccionBusqueda,String sTipoArchivoReporte,List<GrupoClienteFormaPago> grupoclienteformapagosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<GrupoClienteFormaPago> grupoclienteformapagosRespaldo=null;
		
		classes=GrupoClienteFormaPagoConstantesFunciones.getClassesRelationshipsOfGrupoClienteFormaPago(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.grupoclienteformapagoLogic.setDatosCliente(this.datosCliente);
		this.grupoclienteformapagoLogic.setDatosDeep(this.datosDeep);
		this.grupoclienteformapagoLogic.setIsConDeep(true);
		
		grupoclienteformapagosRespaldo=this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos();
		
		this.grupoclienteformapagoLogic.setGrupoClienteFormaPagos(grupoclienteformapagosParaReportes);	
		this.grupoclienteformapagoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		grupoclienteformapagosParaReportes=this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos();
		this.grupoclienteformapagoLogic.setGrupoClienteFormaPagos(grupoclienteformapagosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"grupoclienteformapago_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("GrupoClienteFormaPagos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderGrupoClienteFormaPago("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(GrupoClienteFormaPago grupoclienteformapago : grupoclienteformapagosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderGrupoClienteFormaPago("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			GrupoClienteFormaPagoConstantesFunciones.generarExcelReporteDataGrupoClienteFormaPago("NORMAL",row,workbook,grupoclienteformapago,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(GrupoClienteFormaPagoConstantesFunciones.getGrupoClienteFormaPagoDescripcion(grupoclienteformapago));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Grupo Cliente Forma Pago",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessGrupoClienteFormaPago() throws Exception {		
		this.startProcessGrupoClienteFormaPago(true);
	}
	
	public void startProcessGrupoClienteFormaPago(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasGrupoClienteFormaPago ,this.jPanelParametrosReportesGrupoClienteFormaPago, this.jScrollPanelDatosGrupoClienteFormaPago,this.jPanelPaginacionGrupoClienteFormaPago, this.jScrollPanelDatosEdicionGrupoClienteFormaPago, this.jPanelAccionesGrupoClienteFormaPago,this.jPanelAccionesFormularioGrupoClienteFormaPago,this.jmenuBarGrupoClienteFormaPago,this.jmenuBarDetalleGrupoClienteFormaPago,this.jTtoolBarGrupoClienteFormaPago,this.jTtoolBarDetalleGrupoClienteFormaPago);		
		
		final JTabbedPane jTabbedPaneBusquedasGrupoClienteFormaPago=this.jTabbedPaneBusquedasGrupoClienteFormaPago; 
		
		final JPanel jPanelParametrosReportesGrupoClienteFormaPago=this.jPanelParametrosReportesGrupoClienteFormaPago;
		//final JScrollPane jScrollPanelDatosGrupoClienteFormaPago=this.jScrollPanelDatosGrupoClienteFormaPago;
		final JTable jTableDatosGrupoClienteFormaPago=this.jTableDatosGrupoClienteFormaPago;		
		final JPanel jPanelPaginacionGrupoClienteFormaPago=this.jPanelPaginacionGrupoClienteFormaPago;
		//final JScrollPane jScrollPanelDatosEdicionGrupoClienteFormaPago=this.jScrollPanelDatosEdicionGrupoClienteFormaPago;
		final JPanel jPanelAccionesGrupoClienteFormaPago=this.jPanelAccionesGrupoClienteFormaPago;
		
		JPanel jPanelCamposAuxiliarGrupoClienteFormaPago=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarGrupoClienteFormaPago=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) {
			jPanelCamposAuxiliarGrupoClienteFormaPago=this.jInternalFrameDetalleFormGrupoClienteFormaPago.jPanelCamposGrupoClienteFormaPago;
			jPanelAccionesFormularioAuxiliarGrupoClienteFormaPago=this.jInternalFrameDetalleFormGrupoClienteFormaPago.jPanelAccionesFormularioGrupoClienteFormaPago;
		}
		
		final JPanel jPanelCamposGrupoClienteFormaPago=jPanelCamposAuxiliarGrupoClienteFormaPago;
		final JPanel jPanelAccionesFormularioGrupoClienteFormaPago=jPanelAccionesFormularioAuxiliarGrupoClienteFormaPago;
		
		
		final JMenuBar jmenuBarGrupoClienteFormaPago=this.jmenuBarGrupoClienteFormaPago;
		final JToolBar jTtoolBarGrupoClienteFormaPago=this.jTtoolBarGrupoClienteFormaPago;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarGrupoClienteFormaPago=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarGrupoClienteFormaPago=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) {
			jmenuBarDetalleAuxiliarGrupoClienteFormaPago=this.jInternalFrameDetalleFormGrupoClienteFormaPago.jmenuBarDetalleGrupoClienteFormaPago;
			jTtoolBarDetalleAuxiliarGrupoClienteFormaPago=this.jInternalFrameDetalleFormGrupoClienteFormaPago.jTtoolBarDetalleGrupoClienteFormaPago;
		}
		
		final JMenuBar jmenuBarDetalleGrupoClienteFormaPago=jmenuBarDetalleAuxiliarGrupoClienteFormaPago;
		final JToolBar jTtoolBarDetalleGrupoClienteFormaPago=jTtoolBarDetalleAuxiliarGrupoClienteFormaPago;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasGrupoClienteFormaPago;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesGrupoClienteFormaPago;
			processRunnable.jTableDatos=jTableDatosGrupoClienteFormaPago;
			processRunnable.jPanelCampos=jPanelCamposGrupoClienteFormaPago;
			processRunnable.jPanelPaginacion=jPanelPaginacionGrupoClienteFormaPago;
			processRunnable.jPanelAcciones=jPanelAccionesGrupoClienteFormaPago;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioGrupoClienteFormaPago;
			
			
			processRunnable.jmenuBar=jmenuBarGrupoClienteFormaPago;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleGrupoClienteFormaPago;
			processRunnable.jTtoolBar=jTtoolBarGrupoClienteFormaPago;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleGrupoClienteFormaPago;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasGrupoClienteFormaPago ,jPanelParametrosReportesGrupoClienteFormaPago,jTableDatosGrupoClienteFormaPago, /*jScrollPanelDatosGrupoClienteFormaPago,*/jPanelCamposGrupoClienteFormaPago,jPanelPaginacionGrupoClienteFormaPago, /*jScrollPanelDatosEdicionGrupoClienteFormaPago,*/ jPanelAccionesGrupoClienteFormaPago,jPanelAccionesFormularioGrupoClienteFormaPago,jmenuBarGrupoClienteFormaPago,jmenuBarDetalleGrupoClienteFormaPago,jTtoolBarGrupoClienteFormaPago,jTtoolBarDetalleGrupoClienteFormaPago);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasGrupoClienteFormaPago ,jPanelParametrosReportesGrupoClienteFormaPago, jScrollPanelDatosGrupoClienteFormaPago,jPanelPaginacionGrupoClienteFormaPago, jScrollPanelDatosEdicionGrupoClienteFormaPago, jPanelAccionesGrupoClienteFormaPago,jPanelAccionesFormularioGrupoClienteFormaPago,jmenuBarGrupoClienteFormaPago,jmenuBarDetalleGrupoClienteFormaPago,jTtoolBarGrupoClienteFormaPago,jTtoolBarDetalleGrupoClienteFormaPago);
						
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
	
	public void finishProcessGrupoClienteFormaPago() {// throws Exception 
		this.finishProcessGrupoClienteFormaPago(true);
	}
	
	public void finishProcessGrupoClienteFormaPago(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasGrupoClienteFormaPago ,this.jPanelParametrosReportesGrupoClienteFormaPago, this.jScrollPanelDatosGrupoClienteFormaPago,this.jPanelPaginacionGrupoClienteFormaPago, this.jScrollPanelDatosEdicionGrupoClienteFormaPago, this.jPanelAccionesGrupoClienteFormaPago,this.jPanelAccionesFormularioGrupoClienteFormaPago,this.jmenuBarGrupoClienteFormaPago,this.jmenuBarDetalleGrupoClienteFormaPago,this.jTtoolBarGrupoClienteFormaPago,this.jTtoolBarDetalleGrupoClienteFormaPago);		
		
		final JTabbedPane jTabbedPaneBusquedasGrupoClienteFormaPago=this.jTabbedPaneBusquedasGrupoClienteFormaPago; 
		
		final JPanel jPanelParametrosReportesGrupoClienteFormaPago=this.jPanelParametrosReportesGrupoClienteFormaPago;
		//final JScrollPane jScrollPanelDatosGrupoClienteFormaPago=this.jScrollPanelDatosGrupoClienteFormaPago;
		final JTable jTableDatosGrupoClienteFormaPago=this.jTableDatosGrupoClienteFormaPago;		
		final JPanel jPanelPaginacionGrupoClienteFormaPago=this.jPanelPaginacionGrupoClienteFormaPago;
		//final JScrollPane jScrollPanelDatosEdicionGrupoClienteFormaPago=this.jScrollPanelDatosEdicionGrupoClienteFormaPago;
		final JPanel jPanelAccionesGrupoClienteFormaPago=this.jPanelAccionesGrupoClienteFormaPago;
		
		JPanel jPanelCamposAuxiliarGrupoClienteFormaPago=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarGrupoClienteFormaPago=new JPanel();
		
		if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) {
			jPanelCamposAuxiliarGrupoClienteFormaPago=this.jInternalFrameDetalleFormGrupoClienteFormaPago.jPanelCamposGrupoClienteFormaPago;
			jPanelAccionesFormularioAuxiliarGrupoClienteFormaPago=this.jInternalFrameDetalleFormGrupoClienteFormaPago.jPanelAccionesFormularioGrupoClienteFormaPago;
		}
		
		final JPanel jPanelCamposGrupoClienteFormaPago=jPanelCamposAuxiliarGrupoClienteFormaPago;
		final JPanel jPanelAccionesFormularioGrupoClienteFormaPago=jPanelAccionesFormularioAuxiliarGrupoClienteFormaPago;
		
		
		final JMenuBar jmenuBarGrupoClienteFormaPago=this.jmenuBarGrupoClienteFormaPago;		
		final JToolBar jTtoolBarGrupoClienteFormaPago=this.jTtoolBarGrupoClienteFormaPago;
				
		JMenuBar jmenuBarDetalleAuxiliarGrupoClienteFormaPago=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarGrupoClienteFormaPago=new JToolBar();
		
		if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) {
			jmenuBarDetalleAuxiliarGrupoClienteFormaPago=this.jInternalFrameDetalleFormGrupoClienteFormaPago.jmenuBarDetalleGrupoClienteFormaPago;
			jTtoolBarDetalleAuxiliarGrupoClienteFormaPago=this.jInternalFrameDetalleFormGrupoClienteFormaPago.jTtoolBarDetalleGrupoClienteFormaPago;		
		}
		
		final JMenuBar jmenuBarDetalleGrupoClienteFormaPago=jmenuBarDetalleAuxiliarGrupoClienteFormaPago;
		final JToolBar jTtoolBarDetalleGrupoClienteFormaPago=jTtoolBarDetalleAuxiliarGrupoClienteFormaPago;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasGrupoClienteFormaPago;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesGrupoClienteFormaPago;
			processRunnable.jTableDatos=jTableDatosGrupoClienteFormaPago;
			processRunnable.jPanelCampos=jPanelCamposGrupoClienteFormaPago;
			processRunnable.jPanelPaginacion=jPanelPaginacionGrupoClienteFormaPago;
			processRunnable.jPanelAcciones=jPanelAccionesGrupoClienteFormaPago;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioGrupoClienteFormaPago;
			
			
			processRunnable.jmenuBar=jmenuBarGrupoClienteFormaPago;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleGrupoClienteFormaPago;
			processRunnable.jTtoolBar=jTtoolBarGrupoClienteFormaPago;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleGrupoClienteFormaPago;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasGrupoClienteFormaPago ,jPanelParametrosReportesGrupoClienteFormaPago, jTableDatosGrupoClienteFormaPago,/*jScrollPanelDatosGrupoClienteFormaPago,*/jPanelCamposGrupoClienteFormaPago,jPanelPaginacionGrupoClienteFormaPago, /*jScrollPanelDatosEdicionGrupoClienteFormaPago,*/ jPanelAccionesGrupoClienteFormaPago,jPanelAccionesFormularioGrupoClienteFormaPago,jmenuBarGrupoClienteFormaPago,jmenuBarDetalleGrupoClienteFormaPago,jTtoolBarGrupoClienteFormaPago,jTtoolBarDetalleGrupoClienteFormaPago));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesGrupoClienteFormaPago(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarGrupoClienteFormaPago(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuGrupoClienteFormaPago(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarGrupoClienteFormaPago(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarGrupoClienteFormaPago,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleGrupoClienteFormaPago,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuGrupoClienteFormaPago(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarGrupoClienteFormaPago,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleGrupoClienteFormaPago,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.grupoclienteformapagoConstantesFunciones.getsFinalQueryGrupoClienteFormaPago();
		String  finalQueryPaginacionTodos=this.grupoclienteformapagoConstantesFunciones.getsFinalQueryGrupoClienteFormaPago();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=GrupoClienteFormaPagoConstantesFunciones.getArrayColumnasGlobalesNoGrupoClienteFormaPago(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=GrupoClienteFormaPagoConstantesFunciones.getArrayColumnasGlobalesGrupoClienteFormaPago(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,GrupoClienteFormaPagoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.grupoclienteformapagosEliminados= new ArrayList<GrupoClienteFormaPago>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessGrupoClienteFormaPago();
		
				///*GrupoClienteFormaPagoSessionBean*/this.grupoclienteformapagoSessionBean=new GrupoClienteFormaPagoSessionBean();
			
			if(this.grupoclienteformapagoSessionBean==null) {
				this.grupoclienteformapagoSessionBean=new GrupoClienteFormaPagoSessionBean();
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
					this.iNumeroPaginacion=GrupoClienteFormaPagoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=GrupoClienteFormaPagoConstantesFunciones.getClassesForeignKeysOfGrupoClienteFormaPago(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/grupoclienteformapago."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			grupoclienteformapagosAux= new ArrayList<GrupoClienteFormaPago>();
			
				
			grupoclienteformapagoLogic.setDatosCliente(this.datosCliente);
			grupoclienteformapagoLogic.setDatosDeep(this.datosDeep);
			grupoclienteformapagoLogic.setIsConDeep(true);
			
			
			grupoclienteformapagoLogic.getGrupoClienteFormaPagoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					grupoclienteformapagoLogic.getTodosGrupoClienteFormaPagos(finalQueryGlobal,pagination);
					
					//grupoclienteformapagoLogic.getTodosGrupoClienteFormaPagosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(grupoclienteformapagoLogic.getGrupoClienteFormaPagos()==null|| grupoclienteformapagoLogic.getGrupoClienteFormaPagos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							grupoclienteformapagosAux= new ArrayList<GrupoClienteFormaPago>();
							grupoclienteformapagosAux.addAll(grupoclienteformapagoLogic.getGrupoClienteFormaPagos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupoclienteformapagosAux= new ArrayList<GrupoClienteFormaPago>();
							grupoclienteformapagosAux.addAll(grupoclienteformapagos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							grupoclienteformapagoLogic.getTodosGrupoClienteFormaPagos(finalQueryGlobal+"",this.pagination);												
							
							//grupoclienteformapagoLogic.getTodosGrupoClienteFormaPagosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteGrupoClienteFormaPagos("Todos",grupoclienteformapagoLogic.getGrupoClienteFormaPagos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							grupoclienteformapagoLogic.setGrupoClienteFormaPagos(new ArrayList<GrupoClienteFormaPago>());					
							grupoclienteformapagoLogic.getGrupoClienteFormaPagos().addAll(grupoclienteformapagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupoclienteformapagos=new ArrayList<GrupoClienteFormaPago>();
							grupoclienteformapagos.addAll(grupoclienteformapagosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idGrupoClienteFormaPago=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idGrupoClienteFormaPago=this.idActual;
				
				} else if(this.idGrupoClienteFormaPagoActual!=null && this.idGrupoClienteFormaPagoActual!=0L) {
					idGrupoClienteFormaPago=idGrupoClienteFormaPagoActual;
				}
				
					
				this.sDetalleReporte=GrupoClienteFormaPagoConstantesFunciones.getDetalleIndicePorId(idGrupoClienteFormaPago);
				
				this.grupoclienteformapagos=new ArrayList<GrupoClienteFormaPago>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					grupoclienteformapagoLogic.getEntity(idGrupoClienteFormaPago);
					
					//grupoclienteformapagoLogic.getEntityWithConnection(idGrupoClienteFormaPago);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupoclienteformapagoLogic.setGrupoClienteFormaPagos(new ArrayList<GrupoClienteFormaPago>());
					grupoclienteformapagoLogic.getGrupoClienteFormaPagos().add(grupoclienteformapagoLogic.getGrupoClienteFormaPago());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.grupoclienteformapagos=new ArrayList<GrupoClienteFormaPago>();
					this.grupoclienteformapagos.add(grupoclienteformapago);
				}
				
				if(grupoclienteformapagoLogic.getGrupoClienteFormaPago()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=GrupoClienteFormaPagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					grupoclienteformapagoLogic.getGrupoClienteFormaPagosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GrupoClienteFormaPagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GrupoClienteFormaPagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=grupoclienteformapagoLogic.getGrupoClienteFormaPagos()==null||grupoclienteformapagoLogic.getGrupoClienteFormaPagos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=grupoclienteformapagos==null|| grupoclienteformapagos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoclienteformapagosAux=new ArrayList<GrupoClienteFormaPago>();
						grupoclienteformapagosAux.addAll(grupoclienteformapagoLogic.getGrupoClienteFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupoclienteformapagosAux=new ArrayList<GrupoClienteFormaPago>();
							grupoclienteformapagosAux.addAll(grupoclienteformapagos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							grupoclienteformapagoLogic.getGrupoClienteFormaPagosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GrupoClienteFormaPagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GrupoClienteFormaPagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteGrupoClienteFormaPagos("FK_IdEmpresa",grupoclienteformapagoLogic.getGrupoClienteFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteGrupoClienteFormaPagos("FK_IdEmpresa",grupoclienteformapagos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoclienteformapagoLogic.setGrupoClienteFormaPagos(new ArrayList<GrupoClienteFormaPago>());
						grupoclienteformapagoLogic.getGrupoClienteFormaPagos().addAll(grupoclienteformapagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupoclienteformapagos=new ArrayList<GrupoClienteFormaPago>();
							grupoclienteformapagos.addAll(grupoclienteformapagosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdGrupoCliente")) {
				this.sDetalleReporte=GrupoClienteFormaPagoConstantesFunciones.getDetalleIndiceFK_IdGrupoCliente(id_grupo_clienteFK_IdGrupoCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					grupoclienteformapagoLogic.getGrupoClienteFormaPagosFK_IdGrupoCliente(finalQueryGlobal,pagination,id_grupo_clienteFK_IdGrupoCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GrupoClienteFormaPagoConstantesFunciones.getDetalleIndiceFK_IdGrupoCliente(id_grupo_clienteFK_IdGrupoCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GrupoClienteFormaPagoConstantesFunciones.getDetalleIndiceFK_IdGrupoCliente(id_grupo_clienteFK_IdGrupoCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=grupoclienteformapagoLogic.getGrupoClienteFormaPagos()==null||grupoclienteformapagoLogic.getGrupoClienteFormaPagos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=grupoclienteformapagos==null|| grupoclienteformapagos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoclienteformapagosAux=new ArrayList<GrupoClienteFormaPago>();
						grupoclienteformapagosAux.addAll(grupoclienteformapagoLogic.getGrupoClienteFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupoclienteformapagosAux=new ArrayList<GrupoClienteFormaPago>();
							grupoclienteformapagosAux.addAll(grupoclienteformapagos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							grupoclienteformapagoLogic.getGrupoClienteFormaPagosFK_IdGrupoCliente(finalQueryGlobal,pagination,id_grupo_clienteFK_IdGrupoCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GrupoClienteFormaPagoConstantesFunciones.getDetalleIndiceFK_IdGrupoCliente(id_grupo_clienteFK_IdGrupoCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GrupoClienteFormaPagoConstantesFunciones.getDetalleIndiceFK_IdGrupoCliente(id_grupo_clienteFK_IdGrupoCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteGrupoClienteFormaPagos("FK_IdGrupoCliente",grupoclienteformapagoLogic.getGrupoClienteFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteGrupoClienteFormaPagos("FK_IdGrupoCliente",grupoclienteformapagos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoclienteformapagoLogic.setGrupoClienteFormaPagos(new ArrayList<GrupoClienteFormaPago>());
						grupoclienteformapagoLogic.getGrupoClienteFormaPagos().addAll(grupoclienteformapagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupoclienteformapagos=new ArrayList<GrupoClienteFormaPago>();
							grupoclienteformapagos.addAll(grupoclienteformapagosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoFormaPago")) {
				this.sDetalleReporte=GrupoClienteFormaPagoConstantesFunciones.getDetalleIndiceFK_IdTipoFormaPago(id_tipo_forma_pagoFK_IdTipoFormaPago);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					grupoclienteformapagoLogic.getGrupoClienteFormaPagosFK_IdTipoFormaPago(finalQueryGlobal,pagination,id_tipo_forma_pagoFK_IdTipoFormaPago);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GrupoClienteFormaPagoConstantesFunciones.getDetalleIndiceFK_IdTipoFormaPago(id_tipo_forma_pagoFK_IdTipoFormaPago);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GrupoClienteFormaPagoConstantesFunciones.getDetalleIndiceFK_IdTipoFormaPago(id_tipo_forma_pagoFK_IdTipoFormaPago);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=grupoclienteformapagoLogic.getGrupoClienteFormaPagos()==null||grupoclienteformapagoLogic.getGrupoClienteFormaPagos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=grupoclienteformapagos==null|| grupoclienteformapagos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoclienteformapagosAux=new ArrayList<GrupoClienteFormaPago>();
						grupoclienteformapagosAux.addAll(grupoclienteformapagoLogic.getGrupoClienteFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupoclienteformapagosAux=new ArrayList<GrupoClienteFormaPago>();
							grupoclienteformapagosAux.addAll(grupoclienteformapagos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							grupoclienteformapagoLogic.getGrupoClienteFormaPagosFK_IdTipoFormaPago(finalQueryGlobal,pagination,id_tipo_forma_pagoFK_IdTipoFormaPago);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GrupoClienteFormaPagoConstantesFunciones.getDetalleIndiceFK_IdTipoFormaPago(id_tipo_forma_pagoFK_IdTipoFormaPago);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GrupoClienteFormaPagoConstantesFunciones.getDetalleIndiceFK_IdTipoFormaPago(id_tipo_forma_pagoFK_IdTipoFormaPago);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteGrupoClienteFormaPagos("FK_IdTipoFormaPago",grupoclienteformapagoLogic.getGrupoClienteFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteGrupoClienteFormaPagos("FK_IdTipoFormaPago",grupoclienteformapagos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoclienteformapagoLogic.setGrupoClienteFormaPagos(new ArrayList<GrupoClienteFormaPago>());
						grupoclienteformapagoLogic.getGrupoClienteFormaPagos().addAll(grupoclienteformapagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupoclienteformapagos=new ArrayList<GrupoClienteFormaPago>();
							grupoclienteformapagos.addAll(grupoclienteformapagosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesGrupoClienteFormaPago();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessGrupoClienteFormaPago();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=grupoclienteformapagoLogic.getGrupoClienteFormaPagos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=grupoclienteformapagos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=grupoclienteformapagoLogic.getGrupoClienteFormaPagos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=grupoclienteformapagos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(GrupoClienteFormaPago grupoclienteformapago) {
		Boolean permite=true;
		
		if(this.grupoclienteformapago.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=GrupoClienteFormaPagoConstantesFunciones.getOrderByListaGrupoClienteFormaPago();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=GrupoClienteFormaPagoConstantesFunciones.getOrderByListaGrupoClienteFormaPago();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GrupoClienteFormaPago grupoclienteformapago:grupoclienteformapagoLogic.getGrupoClienteFormaPagos()) {
				if(grupoclienteformapago.getsType().equals(Constantes2.S_TOTALES)) {
					grupoclienteformapagoTotales=grupoclienteformapago;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GrupoClienteFormaPago grupoclienteformapago:this.grupoclienteformapagos) {
				if(grupoclienteformapago.getsType().equals(Constantes2.S_TOTALES)) {
					grupoclienteformapagoTotales=grupoclienteformapago;
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
			this.grupoclienteformapagoAux=new GrupoClienteFormaPago();
			this.grupoclienteformapagoAux.setsType(Constantes2.S_TOTALES);
			this.grupoclienteformapagoAux.setIsNew(false);
			this.grupoclienteformapagoAux.setIsChanged(false);
			this.grupoclienteformapagoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				GrupoClienteFormaPagoConstantesFunciones.TotalizarValoresFilaGrupoClienteFormaPago(this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos(),this.grupoclienteformapagoAux);
				
				this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().add(this.grupoclienteformapagoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				GrupoClienteFormaPagoConstantesFunciones.TotalizarValoresFilaGrupoClienteFormaPago(this.grupoclienteformapagos,this.grupoclienteformapagoAux);
				
				this.grupoclienteformapagos.add(this.grupoclienteformapagoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		grupoclienteformapagoTotales=new GrupoClienteFormaPago();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().remove(grupoclienteformapagoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.grupoclienteformapagos.remove(grupoclienteformapagoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		grupoclienteformapagoTotales=new GrupoClienteFormaPago();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GrupoClienteFormaPago grupoclienteformapago:grupoclienteformapagoLogic.getGrupoClienteFormaPagos()) {
				if(grupoclienteformapago.getsType().equals(Constantes2.S_TOTALES)) {
					grupoclienteformapagoTotales=grupoclienteformapago;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				GrupoClienteFormaPagoConstantesFunciones.TotalizarValoresFilaGrupoClienteFormaPago(this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos(),grupoclienteformapagoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GrupoClienteFormaPago grupoclienteformapago:this.grupoclienteformapagos) {
				if(grupoclienteformapago.getsType().equals(Constantes2.S_TOTALES)) {
					grupoclienteformapagoTotales=grupoclienteformapago;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				GrupoClienteFormaPagoConstantesFunciones.TotalizarValoresFilaGrupoClienteFormaPago(this.grupoclienteformapagos,grupoclienteformapagoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getGrupoClienteFormaPagosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getGrupoClienteFormaPagosFK_IdGrupoCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdGrupoCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getGrupoClienteFormaPagosFK_IdTipoFormaPago()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoFormaPago";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getGrupoClienteFormaPagosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupoclienteformapagoLogic.getGrupoClienteFormaPagosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getGrupoClienteFormaPagosFK_IdGrupoCliente(String sFinalQuery,Long id_grupo_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupoclienteformapagoLogic.getGrupoClienteFormaPagosFK_IdGrupoCliente(sFinalQuery,this.pagination,id_grupo_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getGrupoClienteFormaPagosFK_IdTipoFormaPago(String sFinalQuery,Long id_tipo_forma_pago)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupoclienteformapagoLogic.getGrupoClienteFormaPagosFK_IdTipoFormaPago(sFinalQuery,this.pagination,id_tipo_forma_pago);
				
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
	
	public void inicializarPermisosGrupoClienteFormaPago() {
		this.isPermisoTodoGrupoClienteFormaPago=false;
		this.isPermisoNuevoGrupoClienteFormaPago=false;
		this.isPermisoActualizarGrupoClienteFormaPago=false;
		this.isPermisoActualizarOriginalGrupoClienteFormaPago=false;
		this.isPermisoEliminarGrupoClienteFormaPago=false;
		this.isPermisoGuardarCambiosGrupoClienteFormaPago=false;
		this.isPermisoConsultaGrupoClienteFormaPago=false;
		this.isPermisoBusquedaGrupoClienteFormaPago=false;
		this.isPermisoReporteGrupoClienteFormaPago=false;		
		this.isPermisoOrdenGrupoClienteFormaPago=false;		
		this.isPermisoPaginacionMedioGrupoClienteFormaPago=false;		
		this.isPermisoPaginacionAltoGrupoClienteFormaPago=false;
		this.isPermisoPaginacionTodoGrupoClienteFormaPago=false;
		this.isPermisoCopiarGrupoClienteFormaPago=false;		
		this.isPermisoVerFormGrupoClienteFormaPago=false;		
		this.isPermisoDuplicarGrupoClienteFormaPago=false;		
		this.isPermisoOrdenGrupoClienteFormaPago=false;		
	}
	
	public void setPermisosUsuarioGrupoClienteFormaPago(Boolean isPermiso) {
		this.isPermisoTodoGrupoClienteFormaPago=isPermiso;
		this.isPermisoNuevoGrupoClienteFormaPago=isPermiso;
		this.isPermisoActualizarGrupoClienteFormaPago=isPermiso;
		this.isPermisoActualizarOriginalGrupoClienteFormaPago=isPermiso;
		this.isPermisoEliminarGrupoClienteFormaPago=isPermiso;
		this.isPermisoGuardarCambiosGrupoClienteFormaPago=isPermiso;
		this.isPermisoConsultaGrupoClienteFormaPago=isPermiso;
		this.isPermisoBusquedaGrupoClienteFormaPago=isPermiso;
		this.isPermisoReporteGrupoClienteFormaPago=isPermiso;
		this.isPermisoOrdenGrupoClienteFormaPago=isPermiso;		
		this.isPermisoPaginacionMedioGrupoClienteFormaPago=isPermiso;		
		this.isPermisoPaginacionAltoGrupoClienteFormaPago=isPermiso;		
		this.isPermisoPaginacionTodoGrupoClienteFormaPago=isPermiso;		
		this.isPermisoCopiarGrupoClienteFormaPago=isPermiso;		
		this.isPermisoVerFormGrupoClienteFormaPago=isPermiso;		
		this.isPermisoDuplicarGrupoClienteFormaPago=isPermiso;
		this.isPermisoOrdenGrupoClienteFormaPago=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioGrupoClienteFormaPago(Boolean isPermiso) {
		//this.isPermisoTodoGrupoClienteFormaPago=isPermiso;
		this.isPermisoNuevoGrupoClienteFormaPago=isPermiso;
		this.isPermisoActualizarGrupoClienteFormaPago=isPermiso;
		this.isPermisoActualizarOriginalGrupoClienteFormaPago=isPermiso;
		this.isPermisoEliminarGrupoClienteFormaPago=isPermiso;
		this.isPermisoGuardarCambiosGrupoClienteFormaPago=isPermiso;
		//this.isPermisoConsultaGrupoClienteFormaPago=isPermiso;
		//this.isPermisoBusquedaGrupoClienteFormaPago=isPermiso;
		//this.isPermisoReporteGrupoClienteFormaPago=isPermiso;
		//this.isPermisoOrdenGrupoClienteFormaPago=isPermiso;		
		//this.isPermisoPaginacionMedioGrupoClienteFormaPago=isPermiso;		
		//this.isPermisoPaginacionAltoGrupoClienteFormaPago=isPermiso;		
		//this.isPermisoPaginacionTodoGrupoClienteFormaPago=isPermiso;		
		//this.isPermisoCopiarGrupoClienteFormaPago=isPermiso;		
		//this.isPermisoDuplicarGrupoClienteFormaPago=isPermiso;
		//this.isPermisoOrdenGrupoClienteFormaPago=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioGrupoClienteFormaPagoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(GrupoClienteFormaPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebGrupoClienteFormaPago(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioGrupoClienteFormaPagoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioGrupoClienteFormaPagoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionGrupoClienteFormaPagoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioGrupoClienteFormaPagoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioGrupoClienteFormaPago() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(GrupoClienteFormaPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, GrupoClienteFormaPagoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoGrupoClienteFormaPago=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarGrupoClienteFormaPago=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalGrupoClienteFormaPago=this.isPermisoActualizarGrupoClienteFormaPago;
			this.isPermisoEliminarGrupoClienteFormaPago=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosGrupoClienteFormaPago=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaGrupoClienteFormaPago=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaGrupoClienteFormaPago=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoGrupoClienteFormaPago=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteGrupoClienteFormaPago=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenGrupoClienteFormaPago=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioGrupoClienteFormaPago=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoGrupoClienteFormaPago=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoGrupoClienteFormaPago=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarGrupoClienteFormaPago=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormGrupoClienteFormaPago=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarGrupoClienteFormaPago=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenGrupoClienteFormaPago=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosGrupoClienteFormaPago.setToolTipText(this.jTableDatosGrupoClienteFormaPago.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioGrupoClienteFormaPago(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioGrupoClienteFormaPago(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(GrupoClienteFormaPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(GrupoClienteFormaPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioGrupoClienteFormaPago() throws Exception {
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
	public void inicializarCombosForeignKeyGrupoClienteFormaPagoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.grupoclientesForeignKey=new ArrayList();
				this.tipoformapagosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyGrupoClienteFormaPagoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(GrupoClienteFormaPagoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyGrupoClienteFormaPagoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyGrupoClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoFormaPagoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyGrupoClienteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.grupoclientesForeignKey==null||this.grupoclientesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=GrupoClienteConstantesFunciones.getArrayColumnasGlobalesGrupoCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,GrupoClienteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=GrupoClienteConstantesFunciones.SFINALQUERY;

				this.cargarCombosGrupoClientesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoFormaPagoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoformapagosForeignKey==null||this.tipoformapagosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoFormaPagoConstantesFunciones.getArrayColumnasGlobalesTipoFormaPago(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoFormaPagoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoFormaPagoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoFormaPagosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyGrupoClienteFormaPagoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			GrupoClienteFormaPagoParameterReturnGeneral grupoclienteformapagoReturnGeneral=new GrupoClienteFormaPagoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.grupoclienteformapagoConstantesFunciones.cargarid_empresaGrupoClienteFormaPago)
					 || (this.esRecargarFks && this.grupoclienteformapagoConstantesFunciones.cargarid_empresaGrupoClienteFormaPago)) {

					if(!this.grupoclienteformapagoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+grupoclienteformapagoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalGrupoCliente="";

				if(((this.grupoclientesForeignKey==null||this.grupoclientesForeignKey.size()<=0) && this.grupoclienteformapagoConstantesFunciones.cargarid_grupo_clienteGrupoClienteFormaPago)
					 || (this.esRecargarFks && this.grupoclienteformapagoConstantesFunciones.cargarid_grupo_clienteGrupoClienteFormaPago)) {

					if(!this.grupoclienteformapagoSessionBean.getisBusquedaDesdeForeignKeySesionGrupoCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=GrupoClienteConstantesFunciones.getArrayColumnasGlobalesGrupoCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalGrupoCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,GrupoClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalGrupoCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalGrupoCliente, "");
						finalQueryGlobalGrupoCliente+=GrupoClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosGrupoClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalGrupoCliente=" WHERE " + ConstantesSql.ID + "="+grupoclienteformapagoSessionBean.getlidGrupoClienteActual();
					}
				} else {
					finalQueryGlobalGrupoCliente="NONE";
				}


				String finalQueryGlobalTipoFormaPago="";

				if(((this.tipoformapagosForeignKey==null||this.tipoformapagosForeignKey.size()<=0) && this.grupoclienteformapagoConstantesFunciones.cargarid_tipo_forma_pagoGrupoClienteFormaPago)
					 || (this.esRecargarFks && this.grupoclienteformapagoConstantesFunciones.cargarid_tipo_forma_pagoGrupoClienteFormaPago)) {

					if(!this.grupoclienteformapagoSessionBean.getisBusquedaDesdeForeignKeySesionTipoFormaPago()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoFormaPagoConstantesFunciones.getArrayColumnasGlobalesTipoFormaPago(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoFormaPago=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoFormaPagoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoFormaPago=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoFormaPago, "");
						finalQueryGlobalTipoFormaPago+=TipoFormaPagoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoFormaPagosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoFormaPago=" WHERE " + ConstantesSql.ID + "="+grupoclienteformapagoSessionBean.getlidTipoFormaPagoActual();
					}
				} else {
					finalQueryGlobalTipoFormaPago="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				grupoclienteformapagoReturnGeneral=grupoclienteformapagoLogic.cargarCombosLoteForeignKeyGrupoClienteFormaPago(finalQueryGlobalEmpresa,finalQueryGlobalGrupoCliente,finalQueryGlobalTipoFormaPago);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=grupoclienteformapagoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalGrupoCliente.equals("NONE")) {
				this.grupoclientesForeignKey=grupoclienteformapagoReturnGeneral.getgrupoclientesForeignKey();
			}

			if(!finalQueryGlobalTipoFormaPago.equals("NONE")) {
				this.tipoformapagosForeignKey=grupoclienteformapagoReturnGeneral.gettipoformapagosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyGrupoClienteFormaPago()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyGrupoCliente();
			this.addItemDefectoCombosForeignKeyTipoFormaPago();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.grupoclienteformapagoSessionBean==null) {
				this.grupoclienteformapagoSessionBean=new GrupoClienteFormaPagoSessionBean();
			}

			if(!this.grupoclienteformapagoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyGrupoCliente()throws Exception {
		try {

			if(!this.grupoclienteformapagoSessionBean.getisBusquedaDesdeForeignKeySesionGrupoCliente()) {
				GrupoCliente grupocliente=new GrupoCliente();
				GrupoClienteConstantesFunciones.setGrupoClienteDescripcion(grupocliente,Constantes.SMENSAJE_ESCOJA_OPCION);
				grupocliente.setId(null);

				if(!GrupoClienteConstantesFunciones.ExisteEnLista(this.grupoclientesForeignKey,grupocliente,true)) {

					this.grupoclientesForeignKey.add(0,grupocliente);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoFormaPago()throws Exception {
		try {

			if(!this.grupoclienteformapagoSessionBean.getisBusquedaDesdeForeignKeySesionTipoFormaPago()) {
				TipoFormaPago tipoformapago=new TipoFormaPago();
				TipoFormaPagoConstantesFunciones.setTipoFormaPagoDescripcion(tipoformapago,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoformapago.setId(null);

				if(!TipoFormaPagoConstantesFunciones.ExisteEnLista(this.tipoformapagosForeignKey,tipoformapago,true)) {

					this.tipoformapagosForeignKey.add(0,tipoformapago);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyGrupoClienteFormaPago()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyGrupoClienteFormaPago(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyGrupoClienteFormaPago()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyGrupoClienteFormaPago();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyGrupoClienteFormaPago(GrupoClienteFormaPago grupoclienteformapago)throws Exception {	
		try {
			
			this.setActualGrupoClienteForeignKey(grupoclienteformapago.getid_grupo_cliente(),false,"Formulario");
			this.setActualTipoFormaPagoForeignKey(grupoclienteformapago.getid_tipo_forma_pago(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyGrupoClienteFormaPago(GrupoClienteFormaPago grupoclienteformapago,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyGrupoClienteFormaPago()throws Exception {	
		try {
			
			this.setActualGrupoClienteForeignKey(this.grupoclienteformapagoConstantesFunciones.getid_grupo_cliente(),false,"Formulario");
			this.setActualTipoFormaPagoForeignKey(this.grupoclienteformapagoConstantesFunciones.getid_tipo_forma_pago(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyGrupoClienteFormaPago()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyGrupoClienteFormaPago()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyGrupoClienteFormaPago()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroGrupoClienteFormaPago()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyGrupoClienteFormaPago()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameGrupoClientesForeignKey("Todos");
			this.cargarCombosFrameTipoFormaPagosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyGrupoClienteFormaPago(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameGrupoClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoFormaPagosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyGrupoClienteFormaPago()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_empresaGrupoClienteFormaPago!=null && this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_empresaGrupoClienteFormaPago.getItemCount()>0) {
				this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_empresaGrupoClienteFormaPago.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_grupo_clienteGrupoClienteFormaPago!=null && this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_grupo_clienteGrupoClienteFormaPago.getItemCount()>0) {
				this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_grupo_clienteGrupoClienteFormaPago.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_tipo_forma_pagoGrupoClienteFormaPago!=null && this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_tipo_forma_pagoGrupoClienteFormaPago.getItemCount()>0) {
				this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_tipo_forma_pagoGrupoClienteFormaPago.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public GrupoClienteFormaPagoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public GrupoClienteFormaPagoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public GrupoClienteFormaPagoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.grupoclienteformapagoSessionBean=new GrupoClienteFormaPagoSessionBean(); 
		this.grupoclienteformapagoConstantesFunciones=new GrupoClienteFormaPagoConstantesFunciones(); 
		this.grupoclienteformapagoBean=new GrupoClienteFormaPago();//(this.grupoclienteformapagoConstantesFunciones); 		
		this.grupoclienteformapagoReturnGeneral=new GrupoClienteFormaPagoParameterReturnGeneral(); 
		
		this.grupoclienteformapagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.grupoclienteformapagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public GrupoClienteFormaPagoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public GrupoClienteFormaPagoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public GrupoClienteFormaPagoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessGrupoClienteFormaPago(true);
			
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
			
			this.grupoclienteformapagoConstantesFunciones=new GrupoClienteFormaPagoConstantesFunciones(); 
			this.grupoclienteformapagoBean=new GrupoClienteFormaPago();//this.grupoclienteformapagoConstantesFunciones); 			
			this.grupoclienteformapagoReturnGeneral=new GrupoClienteFormaPagoParameterReturnGeneral(); 
		
			GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Grupo Cliente Forma Pago Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.grupoclienteformapago=new GrupoClienteFormaPago();
			this.grupoclienteformapagos = new ArrayList<GrupoClienteFormaPago>();
			this.grupoclienteformapagosAux = new ArrayList<GrupoClienteFormaPago>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic=new GrupoClienteFormaPagoLogic();
				this.grupoclienteformapagoLogic.getNewConnexionToDeep("");
			}
			
			//this.grupoclienteformapagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.grupoclienteformapagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormGrupoClienteFormaPago);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoGrupoClienteFormaPago!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoGrupoClienteFormaPago);	
					}
					
					if(this.jInternalFrameImportacionGrupoClienteFormaPago!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionGrupoClienteFormaPago);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByGrupoClienteFormaPago!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByGrupoClienteFormaPago);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormGrupoClienteFormaPago);
				this.jInternalFrameDetalleFormGrupoClienteFormaPago.setVisible(false);
				this.jInternalFrameDetalleFormGrupoClienteFormaPago.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoGrupoClienteFormaPago!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoGrupoClienteFormaPago);
					this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.setVisible(false);
					this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionGrupoClienteFormaPago!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionGrupoClienteFormaPago);
					this.jInternalFrameImportacionGrupoClienteFormaPago.setVisible(false);
					this.jInternalFrameImportacionGrupoClienteFormaPago.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByGrupoClienteFormaPago!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByGrupoClienteFormaPago);
					this.jInternalFrameOrderByGrupoClienteFormaPago.setVisible(false);
					this.jInternalFrameOrderByGrupoClienteFormaPago.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idGrupoClienteFormaPagoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=GrupoClienteFormaPagoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.grupoclienteformapagoReturnGeneral=new GrupoClienteFormaPagoParameterReturnGeneral();
			
			this.grupoclienteformapagoParameterGeneral=new GrupoClienteFormaPagoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.grupoclienteformapagoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(GrupoClienteFormaPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,GrupoClienteFormaPagoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado(),this.grupoclienteformapagoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,GrupoClienteFormaPagoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado(),this.grupoclienteformapagoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoGrupoClienteFormaPago=false;
			this.isVisibilidadCeldaDuplicarGrupoClienteFormaPago=true;
			this.isVisibilidadCeldaCopiarGrupoClienteFormaPago=true;
			this.isVisibilidadCeldaVerFormGrupoClienteFormaPago=true;
			this.isVisibilidadCeldaOrdenGrupoClienteFormaPago=true;
			this.isVisibilidadCeldaNuevoRelacionesGrupoClienteFormaPago=false;
			this.isVisibilidadCeldaModificarGrupoClienteFormaPago=false;
			this.isVisibilidadCeldaActualizarGrupoClienteFormaPago=false;
			this.isVisibilidadCeldaEliminarGrupoClienteFormaPago=false;
			this.isVisibilidadCeldaCancelarGrupoClienteFormaPago=false;
			this.isVisibilidadCeldaGuardarGrupoClienteFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosGrupoClienteFormaPago=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdGrupoCliente=true;
			this.isVisibilidadFK_IdTipoFormaPago=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesGrupoClienteFormaPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosGrupoClienteFormaPago();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioGrupoClienteFormaPago(false);
			
			this.setPermisosUsuarioGrupoClienteFormaPago();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado() 
				|| (this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado() && this.grupoclienteformapagoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioGrupoClienteFormaPagoClasesRelacionadas();
			}
			
			if(this.grupoclienteformapagoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioGrupoClienteFormaPagoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!GrupoClienteFormaPagoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosGrupoClienteFormaPago();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualGrupoClienteFormaPago();
			}
			
			if(!this.isPermisoBusquedaGrupoClienteFormaPago) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasGrupoClienteFormaPago.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioGrupoClienteFormaPago,this.isPermisoPaginacionMedioGrupoClienteFormaPago,this.isPermisoPaginacionTodoGrupoClienteFormaPago);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(GrupoClienteFormaPagoConstantesFunciones.getTiposSeleccionarGrupoClienteFormaPago());
				
				this.tiposColumnasSelect=GrupoClienteFormaPagoConstantesFunciones.getTiposSeleccionarGrupoClienteFormaPago(true);
				
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
			//if(!this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioGrupoClienteFormaPago();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioGrupoClienteFormaPago(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioGrupoClienteFormaPago(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesGrupoClienteFormaPago() ;
			
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
			this.grupoclienteLogic=new GrupoClienteLogic();
			this.tipoformapagoLogic=new TipoFormaPagoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				grupoclienteformapagoImplementable= (GrupoClienteFormaPagoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+GrupoClienteFormaPagoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				grupoclienteformapagoImplementableHome= (GrupoClienteFormaPagoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+GrupoClienteFormaPagoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.grupoclienteformapagos= new ArrayList<GrupoClienteFormaPago>();
			this.grupoclienteformapagosEliminados= new ArrayList<GrupoClienteFormaPago>();
						
			this.isEsNuevoGrupoClienteFormaPago=false;
			this.esParaAccionDesdeFormularioGrupoClienteFormaPago=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.grupoclientesForeignKey=new ArrayList<GrupoCliente>() ;
			this.tipoformapagosForeignKey=new ArrayList<TipoFormaPago>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyGrupoClienteFormaPago(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroGrupoClienteFormaPago();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=GrupoClienteFormaPagoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesGrupoClienteFormaPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingGrupoClienteFormaPago(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioGrupoClienteFormaPago();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioGrupoClienteFormaPago();
			}
			
			GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasGrupoClienteFormaPago.getTabCount(); i++) {
					this.jTabbedPaneBusquedasGrupoClienteFormaPago.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasGrupoClienteFormaPago.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessGrupoClienteFormaPago(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga GrupoClienteFormaPago: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectGrupoClienteFormaPago() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesGrupoClienteFormaPago")) {
				iIndex=this.jInternalFrameDetalleFormGrupoClienteFormaPago.jTabbedPaneRelacionesGrupoClienteFormaPago.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormGrupoClienteFormaPago.jTabbedPaneRelacionesGrupoClienteFormaPago.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosGrupoClienteFormaPago.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessGrupoClienteFormaPago();	
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
	
	public void cargarCombosForeignKeyGrupoClienteFormaPago(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyGrupoClienteFormaPago(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyGrupoClienteFormaPago(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyGrupoClienteFormaPagoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyGrupoClienteFormaPago();
		
		this.cargarCombosFrameForeignKeyGrupoClienteFormaPago();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyGrupoClienteFormaPago();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyGrupoClienteFormaPago();
		}
	}
	
	

	public void cargarCombosForeignKeyGrupoCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyGrupoClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyGrupoCliente();
				this.cargarCombosFrameGrupoClientesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaGrupoCliente(this.grupoclientesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoFormaPago(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoFormaPagoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoFormaPago();
				this.cargarCombosFrameTipoFormaPagosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoFormaPago(this.tipoformapagosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoGrupoClienteFormaPagoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.grupoclienteformapagoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormGrupoClienteFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
			
			
			if(jTableDatosGrupoClienteFormaPago.getRowCount()>=1) {
				jTableDatosGrupoClienteFormaPago.removeRowSelectionInterval(0, jTableDatosGrupoClienteFormaPago.getRowCount()-1);						
			}
			
			this.isEsNuevoGrupoClienteFormaPago=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoGrupoClienteFormaPago(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesGrupoClienteFormaPago(true);			
			//this.grupoclienteformapago=new GrupoClienteFormaPago();
			//this.grupoclienteformapago.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesGrupoClienteFormaPago(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGrupoClienteFormaPago() ;
			
			if(GrupoClienteFormaPagoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleGrupoClienteFormaPago(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.grupoclienteformapago);	
			this.actualizarInformacion("INFO_PADRE",false,this.grupoclienteformapago);				
			
			GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
			
			if(this.grupoclienteformapagoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar GrupoClienteFormaPago: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarGrupoClienteFormaPagoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<GrupoClienteFormaPago> grupoclienteformapagosSeleccionados=new ArrayList<GrupoClienteFormaPago>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosGrupoClienteFormaPago.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosGrupoClienteFormaPago.getSelectedRows().length;			
			}
			
			grupoclienteformapagosSeleccionados=this.getGrupoClienteFormaPagosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoGrupoClienteFormaPago--;			
				//GrupoClienteFormaPago grupoclienteformapagoAux= new GrupoClienteFormaPago();			
				//grupoclienteformapagoAux.setId(this.iIdNuevoGrupoClienteFormaPago);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//GrupoClienteFormaPago grupoclienteformapagoOrigen=new GrupoClienteFormaPago();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(GrupoClienteFormaPago grupoclienteformapagoOrigen : grupoclienteformapagosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosGrupoClienteFormaPago.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							grupoclienteformapagoOrigen =(GrupoClienteFormaPago) this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupoclienteformapagoOrigen =(GrupoClienteFormaPago) this.grupoclienteformapagos.toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaGrupoClienteFormaPago();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.grupoclienteformapago.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosGrupoClienteFormaPago(grupoclienteformapagoOrigen,this.grupoclienteformapago,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoClienteFormaPago(this.grupoclienteformapago);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().add(this.grupoclienteformapagoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.grupoclienteformapagos.add(this.grupoclienteformapagoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaGrupoClienteFormaPago(false);
				
				this.jTableDatosGrupoClienteFormaPago.setRowSelectionInterval(this.getIndiceNuevoGrupoClienteFormaPago(), this.getIndiceNuevoGrupoClienteFormaPago());
				
				int iLastRow =  this.jTableDatosGrupoClienteFormaPago.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosGrupoClienteFormaPago.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosGrupoClienteFormaPago.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaGrupoClienteFormaPago(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarGrupoClienteFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<GrupoClienteFormaPago> grupoclienteformapagosSeleccionados=new ArrayList<GrupoClienteFormaPago>();									
		
			GrupoClienteFormaPago grupoclienteformapagoOrigen=new GrupoClienteFormaPago();
			GrupoClienteFormaPago grupoclienteformapagoDestino=new GrupoClienteFormaPago();
				
			grupoclienteformapagosSeleccionados=this.getGrupoClienteFormaPagosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosGrupoClienteFormaPago.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || grupoclienteformapagosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosGrupoClienteFormaPago.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoclienteformapagoOrigen =(GrupoClienteFormaPago) this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						grupoclienteformapagoOrigen =(GrupoClienteFormaPago) this.grupoclienteformapagos.toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoclienteformapagoDestino =(GrupoClienteFormaPago) this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						grupoclienteformapagoDestino =(GrupoClienteFormaPago) this.grupoclienteformapagos.toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				grupoclienteformapagoOrigen =grupoclienteformapagosSeleccionados.get(0);
				grupoclienteformapagoDestino =grupoclienteformapagosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosGrupoClienteFormaPago(grupoclienteformapagoOrigen,grupoclienteformapagoDestino,true,false);
				
				grupoclienteformapagoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(grupoclienteformapagoDestino,grupoclienteformapagoLogic.getGrupoClienteFormaPagos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(grupoclienteformapagoDestino,grupoclienteformapagos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaGrupoClienteFormaPago(false);
				
				//this.jTableDatosGrupoClienteFormaPago.setRowSelectionInterval(this.getIndiceNuevoGrupoClienteFormaPago(), this.getIndiceNuevoGrupoClienteFormaPago());
				
				int iLastRow =  this.jTableDatosGrupoClienteFormaPago.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosGrupoClienteFormaPago.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosGrupoClienteFormaPago.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaGrupoClienteFormaPago(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormGrupoClienteFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormGrupoClienteFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarGrupoClienteFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesGrupoClienteFormaPago.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasGrupoClienteFormaPago.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesGrupoClienteFormaPago.setVisible(!isVisible);
			this.jPanelPaginacionGrupoClienteFormaPago.setVisible(!isVisible);
			this.jPanelAccionesGrupoClienteFormaPago.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarGrupoClienteFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameGrupoClienteFormaPago();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoGrupoClienteFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoGrupoClienteFormaPago();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionGrupoClienteFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionGrupoClienteFormaPago();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByGrupoClienteFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByGrupoClienteFormaPago();
			
			this.abrirFrameOrderByGrupoClienteFormaPago();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByGrupoClienteFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByGrupoClienteFormaPago();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleGrupoClienteFormaPago(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormGrupoClienteFormaPago);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormGrupoClienteFormaPago.isMaximum()) {
					this.jInternalFrameDetalleFormGrupoClienteFormaPago.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormGrupoClienteFormaPago.setSize(this.jInternalFrameDetalleFormGrupoClienteFormaPago.iWidthFormulario,this.jInternalFrameDetalleFormGrupoClienteFormaPago.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormGrupoClienteFormaPago.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormGrupoClienteFormaPago.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormGrupoClienteFormaPago.isMaximum()) {
						this.jInternalFrameDetalleFormGrupoClienteFormaPago.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormGrupoClienteFormaPago.jContentPaneDetalleGrupoClienteFormaPago.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormGrupoClienteFormaPago.jTabbedPaneRelacionesGrupoClienteFormaPago.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormGrupoClienteFormaPago.jContentPaneDetalleGrupoClienteFormaPago.getWidth(),GrupoClienteFormaPagoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormGrupoClienteFormaPago.jTabbedPaneRelacionesGrupoClienteFormaPago.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormGrupoClienteFormaPago.jContentPaneDetalleGrupoClienteFormaPago.getWidth(),GrupoClienteFormaPagoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormGrupoClienteFormaPago.jTabbedPaneRelacionesGrupoClienteFormaPago.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormGrupoClienteFormaPago.jContentPaneDetalleGrupoClienteFormaPago.getWidth(),GrupoClienteFormaPagoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormGrupoClienteFormaPago.setVisible(true);
	        this.jInternalFrameDetalleFormGrupoClienteFormaPago.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByGrupoClienteFormaPago() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByGrupoClienteFormaPago==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByGrupoClienteFormaPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGrupoClienteFormaPago,false,this);
				} else {
					this.jInternalFrameOrderByGrupoClienteFormaPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGrupoClienteFormaPago,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByGrupoClienteFormaPago);
				this.jInternalFrameOrderByGrupoClienteFormaPago.setVisible(false);
				this.jInternalFrameOrderByGrupoClienteFormaPago.setSelected(false);
				
				this.jInternalFrameOrderByGrupoClienteFormaPago.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByGrupoClienteFormaPago"));
				
				this.inicializarActualizarBindingTablaOrderByGrupoClienteFormaPago();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionGrupoClienteFormaPago() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionGrupoClienteFormaPago==null) {
				
				this.jInternalFrameImportacionGrupoClienteFormaPago=new ImportacionJInternalFrame(GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionGrupoClienteFormaPago);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionGrupoClienteFormaPago);
				this.jInternalFrameImportacionGrupoClienteFormaPago.setVisible(false);
				this.jInternalFrameImportacionGrupoClienteFormaPago.setSelected(false);


				this.jInternalFrameImportacionGrupoClienteFormaPago.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionGrupoClienteFormaPago"));
				this.jInternalFrameImportacionGrupoClienteFormaPago.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionGrupoClienteFormaPago"));
				this.jInternalFrameImportacionGrupoClienteFormaPago.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionGrupoClienteFormaPago"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoGrupoClienteFormaPago() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoGrupoClienteFormaPago==null) {
				this.jInternalFrameReporteDinamicoGrupoClienteFormaPago=new ReporteDinamicoJInternalFrame(GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoGrupoClienteFormaPago);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoGrupoClienteFormaPago);
				this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.setVisible(false);
				this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoGrupoClienteFormaPago"));
				this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoGrupoClienteFormaPago"));
				this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoGrupoClienteFormaPago"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualGrupoClienteFormaPago();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleGrupoClienteFormaPago() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormGrupoClienteFormaPago);
			
	       	this.jInternalFrameDetalleFormGrupoClienteFormaPago.setVisible(false);
	        this.jInternalFrameDetalleFormGrupoClienteFormaPago.setSelected(false);
			
			//this.jInternalFrameDetalleFormGrupoClienteFormaPago.dispose();
			//this.jInternalFrameDetalleFormGrupoClienteFormaPago=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoGrupoClienteFormaPago() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.setVisible(true);
	        this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionGrupoClienteFormaPago() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionGrupoClienteFormaPago.setVisible(true);
	        this.jInternalFrameImportacionGrupoClienteFormaPago.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByGrupoClienteFormaPago() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByGrupoClienteFormaPago.setVisible(true);
	        this.jInternalFrameOrderByGrupoClienteFormaPago.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByGrupoClienteFormaPago() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByGrupoClienteFormaPago.setVisible(false);
	        this.jInternalFrameOrderByGrupoClienteFormaPago.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoGrupoClienteFormaPago() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.setVisible(false);
	        this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionGrupoClienteFormaPago() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionGrupoClienteFormaPago.setVisible(false);
	        this.jInternalFrameImportacionGrupoClienteFormaPago.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarGrupoClienteFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarGrupoClienteFormaPago(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarGrupoClienteFormaPago(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosGrupoClienteFormaPago.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesGrupoClienteFormaPago(true);
			//this.isEsNuevoGrupoClienteFormaPago=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapago =(GrupoClienteFormaPago) this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.grupoclienteformapago =(GrupoClienteFormaPago) this.grupoclienteformapagos.toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesGrupoClienteFormaPago("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesGrupoClienteFormaPago(false) ;
			
			if(grupoclienteformapagoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(GrupoClienteFormaPagoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleGrupoClienteFormaPago(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGrupoClienteFormaPago(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaGrupoClienteFormaPagoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosGrupoClienteFormaPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteformapago =(GrupoClienteFormaPago) this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.grupoclienteformapago =(GrupoClienteFormaPago) this.grupoclienteformapagos.toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarGrupoClienteFormaPago(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormGrupoClienteFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosGrupoClienteFormaPago.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesGrupoClienteFormaPago(true);
			//this.isEsNuevoGrupoClienteFormaPago=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapago =(GrupoClienteFormaPago) this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.grupoclienteformapago =(GrupoClienteFormaPago) this.grupoclienteformapagos.toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.grupoclienteformapago.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesGrupoClienteFormaPago("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesGrupoClienteFormaPago(false) ;
			
			if(GrupoClienteFormaPagoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleGrupoClienteFormaPago(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGrupoClienteFormaPago(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaGrupoCliente(List<GrupoCliente> grupoclientesForeignKey)throws Exception{
		TableColumn tableColumnGrupoCliente=this.jTableDatosGrupoClienteFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoClienteFormaPago,GrupoClienteFormaPagoConstantesFunciones.LABEL_IDGRUPOCLIENTE));
		TableCellEditor tableCellEditorGrupoCliente =tableColumnGrupoCliente.getCellEditor();

		GrupoClienteTableCell grupoclienteTableCellFk=(GrupoClienteTableCell)tableCellEditorGrupoCliente;

		if(grupoclienteTableCellFk!=null) {
			grupoclienteTableCellFk.setgrupoclientesForeignKey(grupoclientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosGrupoClienteFormaPago.getSelectedRow();

		//if(intSelectedRow<=0) {
			//grupoclienteTableCellFk.setRowActual(intSelectedRow);
			//grupoclienteTableCellFk.setgrupoclientesForeignKeyActual(grupoclientesForeignKey);
		//}


		if(grupoclienteTableCellFk!=null) {
			grupoclienteTableCellFk.RecargarGrupoClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoFormaPago(List<TipoFormaPago> tipoformapagosForeignKey)throws Exception{
		TableColumn tableColumnTipoFormaPago=this.jTableDatosGrupoClienteFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoClienteFormaPago,GrupoClienteFormaPagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO));
		TableCellEditor tableCellEditorTipoFormaPago =tableColumnTipoFormaPago.getCellEditor();

		TipoFormaPagoTableCell tipoformapagoTableCellFk=(TipoFormaPagoTableCell)tableCellEditorTipoFormaPago;

		if(tipoformapagoTableCellFk!=null) {
			tipoformapagoTableCellFk.settipoformapagosForeignKey(tipoformapagosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosGrupoClienteFormaPago.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoformapagoTableCellFk.setRowActual(intSelectedRow);
			//tipoformapagoTableCellFk.settipoformapagosForeignKeyActual(tipoformapagosForeignKey);
		//}


		if(tipoformapagoTableCellFk!=null) {
			tipoformapagoTableCellFk.RecargarTipoFormaPagosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarGrupoClienteFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesGrupoClienteFormaPago(false);
			
			//if(!this.isEsNuevoGrupoClienteFormaPago) {								
				int intSelectedRow = this.jTableDatosGrupoClienteFormaPago.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteformapago =(GrupoClienteFormaPago) this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.grupoclienteformapago =(GrupoClienteFormaPago) this.grupoclienteformapagos.toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(GrupoClienteFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualGrupoClienteFormaPago(this.grupoclienteformapago,true);
				this.setVariablesFormularioToObjetoActualForeignKeysGrupoClienteFormaPago(this.grupoclienteformapago);
				
			}
			
			if(this.permiteMantenimiento(this.grupoclienteformapago)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoGrupoClienteFormaPago=true;
					this.inicializarActualizarBindingTablaGrupoClienteFormaPago(false);
					this.isEsNuevoGrupoClienteFormaPago=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoGrupoClienteFormaPago=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoGrupoClienteFormaPago=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesGrupoClienteFormaPago(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualGrupoClienteFormaPago(false);
				
				this.habilitarDeshabilitarControlesGrupoClienteFormaPago(false);
			
												
				
				if(GrupoClienteFormaPagoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleGrupoClienteFormaPago();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoGrupoClienteFormaPagoActionPerformed(evt,grupoclienteformapagoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualGrupoClienteFormaPago(this.grupoclienteformapago,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosGrupoClienteFormaPago.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,grupoclienteformapagoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.grupoclienteformapago.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(GrupoClienteFormaPago.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoClienteFormaPago.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarGrupoClienteFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosGrupoClienteFormaPago.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapago =(GrupoClienteFormaPago) this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
				this.grupoclienteformapago.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.grupoclienteformapago =(GrupoClienteFormaPago) this.grupoclienteformapagos.toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
				this.grupoclienteformapago.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.grupoclienteformapago)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((GrupoClienteFormaPagoModel) this.jTableDatosGrupoClienteFormaPago.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoGrupoClienteFormaPago=true;
				this.inicializarActualizarBindingTablaGrupoClienteFormaPago(false);
				this.isEsNuevoGrupoClienteFormaPago=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesGrupoClienteFormaPago(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualGrupoClienteFormaPago(false);
				
				this.habilitarDeshabilitarControlesGrupoClienteFormaPago(false);
				
				
				
				if(GrupoClienteFormaPagoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleGrupoClienteFormaPago();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarGrupoClienteFormaPagoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosGrupoClienteFormaPago.getRowCount()>=1) {
				jTableDatosGrupoClienteFormaPago.removeRowSelectionInterval(0, jTableDatosGrupoClienteFormaPago.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesGrupoClienteFormaPago(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaGrupoClienteFormaPago(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesGrupoClienteFormaPago(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGrupoClienteFormaPago(false) ;
			
			this.isEsNuevoGrupoClienteFormaPago=false;
			
			if(GrupoClienteFormaPagoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleGrupoClienteFormaPago();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosGrupoClienteFormaPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingGrupoClienteFormaPago(false);
				
				//SI ES MANUAL
				if(GrupoClienteFormaPagoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualGrupoClienteFormaPago();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosGrupoClienteFormaPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoGrupoClienteFormaPago--;			
			//GrupoClienteFormaPago grupoclienteformapagoAux= new GrupoClienteFormaPago();			
			//grupoclienteformapagoAux.setId(this.iIdNuevoGrupoClienteFormaPago);
			
			if(this.jInternalFrameDetalleFormGrupoClienteFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaGrupoClienteFormaPago();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysGrupoClienteFormaPago(this.grupoclienteformapago);
			
			this.grupoclienteformapago.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().add(this.grupoclienteformapagoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.grupoclienteformapagos.add(this.grupoclienteformapagoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaGrupoClienteFormaPago(false);
			
			this.jTableDatosGrupoClienteFormaPago.setRowSelectionInterval(this.getIndiceNuevoGrupoClienteFormaPago(), this.getIndiceNuevoGrupoClienteFormaPago());
			
			int iLastRow =  this.jTableDatosGrupoClienteFormaPago.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosGrupoClienteFormaPago.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosGrupoClienteFormaPago.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaGrupoClienteFormaPago(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionGrupoClienteFormaPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingGrupoClienteFormaPago(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGrupoClienteFormaPago(false);
			
			//SI ES MANUAL
			if(GrupoClienteFormaPagoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualGrupoClienteFormaPago();
			}
			
			//this.abrirFrameTreeGrupoClienteFormaPago();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionGrupoClienteFormaPagoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Grupo Cliente Forma PagoS ?", "MANTENIMIENTO DE Grupo Cliente Forma Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionGrupoClienteFormaPago.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralGrupoClienteFormaPago();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.grupoclienteformapagoReturnGeneral=grupoclienteformapagoLogic.procesarImportacionGrupoClienteFormaPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.grupoclienteformapagoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarGrupoClienteFormaPagoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionGrupoClienteFormaPagoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionGrupoClienteFormaPago.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionGrupoClienteFormaPago.setFileImportacion(this.jInternalFrameImportacionGrupoClienteFormaPago.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionGrupoClienteFormaPago.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionGrupoClienteFormaPago.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionGrupoClienteFormaPago.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionGrupoClienteFormaPago.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoGrupoClienteFormaPagoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<GrupoClienteFormaPago> grupoclienteformapagosSeleccionados=new ArrayList<GrupoClienteFormaPago>();		

		grupoclienteformapagosSeleccionados=this.getGrupoClienteFormaPagosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("GrupoClienteFormaPagoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"GrupoClienteFormaPagoBaseDesign.jrxml";
			
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
			
			this.generarReporteGrupoClienteFormaPagos("Todos",grupoclienteformapagosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Grupo Cliente Forma Pago",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case GrupoClienteFormaPagoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GrupoClienteFormaPagoConstantesFunciones.LABEL_IDGRUPOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_GrupoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_GrupoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_GrupoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_GrupoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GrupoClienteFormaPagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoFormaPago_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoFormaPago_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoFormaPago_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoFormaPago_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case GrupoClienteFormaPagoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case GrupoClienteFormaPagoConstantesFunciones.LABEL_IDGRUPOCLIENTE:
					sNombreCampoCategoria="id_grupo_cliente";
					break;

				case GrupoClienteFormaPagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO:
					sNombreCampoCategoria="id_tipo_forma_pago";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case GrupoClienteFormaPagoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case GrupoClienteFormaPagoConstantesFunciones.LABEL_IDGRUPOCLIENTE:
					sNombreCampoCategoriaValor="id_grupo_cliente";
					break;

				case GrupoClienteFormaPagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO:
					sNombreCampoCategoriaValor="id_tipo_forma_pago";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case GrupoClienteFormaPagoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case GrupoClienteFormaPagoConstantesFunciones.LABEL_IDGRUPOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Grupo Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_grupo_cliente");
					break;

				case GrupoClienteFormaPagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"T. Forma Pago",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_forma_pago");
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
	
	public void jButtonGenerarExcelReporteDinamicoGrupoClienteFormaPagoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<GrupoClienteFormaPago> grupoclienteformapagosSeleccionados=new ArrayList<GrupoClienteFormaPago>();		
		
		grupoclienteformapagosSeleccionados=this.getGrupoClienteFormaPagosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"grupoclienteformapago";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("GrupoClienteFormaPagos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case GrupoClienteFormaPagoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GrupoClienteFormaPagoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(GrupoClienteFormaPago grupoclienteformapago:grupoclienteformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(grupoclienteformapago.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GrupoClienteFormaPagoConstantesFunciones.LABEL_IDGRUPOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GrupoClienteFormaPagoConstantesFunciones.LABEL_IDGRUPOCLIENTE);
					iRow++;

					for(GrupoClienteFormaPago grupoclienteformapago:grupoclienteformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(grupoclienteformapago.getgrupocliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GrupoClienteFormaPagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GrupoClienteFormaPagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO);
					iRow++;

					for(GrupoClienteFormaPago grupoclienteformapago:grupoclienteformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(grupoclienteformapago.gettipoformapago_descripcion());
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
			//	this.getFilaCabeceraExportarExcelGrupoClienteFormaPago(row);				
			//	iRow++;
			//}				
			
			//for(GrupoClienteFormaPago grupoclienteformapagoAux:grupoclienteformapagosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelGrupoClienteFormaPago(grupoclienteformapagoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Grupo Cliente Forma Pago",JOptionPane.INFORMATION_MESSAGE);
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
				this.grupoclienteformapagoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGrupoClienteFormaPago(false);
			
			//SI ES MANUAL
			if(GrupoClienteFormaPagoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualGrupoClienteFormaPago();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresGrupoClienteFormaPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGrupoClienteFormaPago(false);
			
			//SI ES MANUAL
			if(GrupoClienteFormaPagoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualGrupoClienteFormaPago();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesGrupoClienteFormaPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGrupoClienteFormaPago(false);
			
			//SI ES MANUAL
			if(GrupoClienteFormaPagoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualGrupoClienteFormaPago();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaGrupoClienteFormaPago() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosGrupoClienteFormaPago.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosGrupoClienteFormaPago.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosGrupoClienteFormaPago.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosGrupoClienteFormaPago.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosGrupoClienteFormaPago.setMinimumSize(dimensionMinimum);
		this.jTableDatosGrupoClienteFormaPago.setMaximumSize(dimensionMaximum);
		this.jTableDatosGrupoClienteFormaPago.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingGrupoClienteFormaPago(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingGrupoClienteFormaPago(esInicializar,true);
	}
	
	public void inicializarActualizarBindingGrupoClienteFormaPago(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaGrupoClienteFormaPago(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesGrupoClienteFormaPago(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasGrupoClienteFormaPago(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesGrupoClienteFormaPago(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesGrupoClienteFormaPago(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !GrupoClienteFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!GrupoClienteFormaPagoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualGrupoClienteFormaPago() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaGrupoClienteFormaPago();
		
		this.inicializarActualizarBindingBotonesManualGrupoClienteFormaPago(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualGrupoClienteFormaPago();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesGrupoClienteFormaPago() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualGrupoClienteFormaPago(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualGrupoClienteFormaPago(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosGrupoClienteFormaPago.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosGrupoClienteFormaPago.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteGrupoClienteFormaPago.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormGrupoClienteFormaPago.jCheckBoxPostAccionNuevoGrupoClienteFormaPago.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormGrupoClienteFormaPago.jCheckBoxPostAccionSinCerrarGrupoClienteFormaPago.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormGrupoClienteFormaPago.jCheckBoxPostAccionSinMensajeGrupoClienteFormaPago.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosGrupoClienteFormaPago.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosGrupoClienteFormaPago.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteGrupoClienteFormaPago.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) {
				this.jInternalFrameDetalleFormGrupoClienteFormaPago.jCheckBoxPostAccionNuevoGrupoClienteFormaPago.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormGrupoClienteFormaPago.jCheckBoxPostAccionSinCerrarGrupoClienteFormaPago.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormGrupoClienteFormaPago.jCheckBoxPostAccionSinMensajeGrupoClienteFormaPago.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionGrupoClienteFormaPago.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionGrupoClienteFormaPago.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxTiposAccionesFormularioGrupoClienteFormaPago.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesGrupoClienteFormaPago.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoGrupoClienteFormaPago!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesGrupoClienteFormaPago.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesGrupoClienteFormaPago.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarGrupoClienteFormaPago.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesGrupoClienteFormaPago.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoGrupoClienteFormaPago!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesGrupoClienteFormaPago.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralGrupoClienteFormaPago.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesGrupoClienteFormaPago(Boolean esInicializar) throws Exception {
		try	{	
			if(GrupoClienteFormaPagoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualGrupoClienteFormaPago(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesGrupoClienteFormaPago() throws Exception {
		try	{
			if(GrupoClienteFormaPagoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualGrupoClienteFormaPago();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleGrupoClienteFormaPago() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxTiposAccionesFormularioGrupoClienteFormaPago.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxTiposAccionesFormularioGrupoClienteFormaPago.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualGrupoClienteFormaPago() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesGrupoClienteFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesGrupoClienteFormaPago.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesGrupoClienteFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesGrupoClienteFormaPago.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesGrupoClienteFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesGrupoClienteFormaPago.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionGrupoClienteFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionGrupoClienteFormaPago.addItem(reporte);
			}
			
			
			if(!this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionGrupoClienteFormaPago.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionGrupoClienteFormaPago.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesGrupoClienteFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesGrupoClienteFormaPago.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesGrupoClienteFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesGrupoClienteFormaPago.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxTiposAccionesFormularioGrupoClienteFormaPago.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxTiposAccionesFormularioGrupoClienteFormaPago.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarGrupoClienteFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarGrupoClienteFormaPago.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarGrupoClienteFormaPago.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualGrupoClienteFormaPago();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualGrupoClienteFormaPago() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoGrupoClienteFormaPago!=null) {
				this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoGrupoClienteFormaPago!=null) {
				this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoGrupoClienteFormaPago!=null) {
				
				if(this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualGrupoClienteFormaPago()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_grupo_clienteFK_IdGrupoClienteGrupoClienteFormaPago.getSelectedItem()!=null){this.id_grupo_clienteFK_IdGrupoCliente=((GrupoCliente)this.jComboBoxid_grupo_clienteFK_IdGrupoClienteGrupoClienteFormaPago.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoGrupoClienteFormaPago.getSelectedItem()!=null){this.id_tipo_forma_pagoFK_IdTipoFormaPago=((TipoFormaPago)this.jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoGrupoClienteFormaPago.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasGrupoClienteFormaPago(Boolean esInicializar) throws Exception {				
		if(GrupoClienteFormaPagoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualGrupoClienteFormaPago();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaGrupoClienteFormaPago() throws Exception {
		this.inicializarActualizarBindingTablaGrupoClienteFormaPago(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByGrupoClienteFormaPago() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByGrupoClienteFormaPago.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByGrupoClienteFormaPago.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByGrupoClienteFormaPago.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new GrupoClienteFormaPagoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByGrupoClienteFormaPago.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByGrupoClienteFormaPago.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new GrupoClienteFormaPagoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosGrupoClienteFormaPagoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoClienteFormaPagoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new GrupoClienteFormaPagoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByGrupoClienteFormaPago.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByGrupoClienteFormaPago.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new GrupoClienteFormaPagoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByGrupoClienteFormaPago.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaGrupoClienteFormaPago(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=grupoclienteformapagoLogic.getGrupoClienteFormaPagos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=grupoclienteformapagos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(GrupoClienteFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosGrupoClienteFormaPago.setModel(new GrupoClienteFormaPagoModel(this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosGrupoClienteFormaPago.setModel(new GrupoClienteFormaPagoModel(this.grupoclienteformapagos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByGrupoClienteFormaPago!=null && this.jInternalFrameOrderByGrupoClienteFormaPago.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByGrupoClienteFormaPago();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosGrupoClienteFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoClienteFormaPago,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new GrupoClienteFormaPagoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO,grupoclienteformapagoConstantesFunciones.resaltarSeleccionarGrupoClienteFormaPago,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO,grupoclienteformapagoConstantesFunciones.resaltarSeleccionarGrupoClienteFormaPago,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosGrupoClienteFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoClienteFormaPago,GrupoClienteFormaPagoConstantesFunciones.LABEL_ID));

		if(this.grupoclienteformapagoConstantesFunciones.mostraridGrupoClienteFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GrupoClienteFormaPagoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.grupoclienteformapagoConstantesFunciones.resaltaridGrupoClienteFormaPago,this.grupoclienteformapagoConstantesFunciones.activaridGrupoClienteFormaPago,this,true,"idGrupoClienteFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.grupoclienteformapagoConstantesFunciones.resaltaridGrupoClienteFormaPago,this.grupoclienteformapagoConstantesFunciones.activaridGrupoClienteFormaPago,this,true,"idGrupoClienteFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGrupoClienteFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoClienteFormaPago,GrupoClienteFormaPagoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.grupoclienteformapagoConstantesFunciones.mostrarid_empresaGrupoClienteFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GrupoClienteFormaPagoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.grupoclienteformapagoConstantesFunciones.resaltarid_empresaGrupoClienteFormaPago,this,this.grupoclienteformapagoConstantesFunciones.activarid_empresaGrupoClienteFormaPago));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.grupoclienteformapagoConstantesFunciones.resaltarid_empresaGrupoClienteFormaPago,this,this.grupoclienteformapagoConstantesFunciones.activarid_empresaGrupoClienteFormaPago,false,"id_empresaGrupoClienteFormaPago","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new GrupoClienteFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGrupoClienteFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoClienteFormaPago,GrupoClienteFormaPagoConstantesFunciones.LABEL_IDGRUPOCLIENTE));

		if(this.grupoclienteformapagoConstantesFunciones.mostrarid_grupo_clienteGrupoClienteFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GrupoClienteFormaPagoConstantesFunciones.LABEL_IDGRUPOCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new GrupoClienteTableCell(this.grupoclientesForeignKey,this.grupoclienteformapagoConstantesFunciones.resaltarid_grupo_clienteGrupoClienteFormaPago,this,this.grupoclienteformapagoConstantesFunciones.activarid_grupo_clienteGrupoClienteFormaPago));
			tableColumn.setCellEditor(new GrupoClienteTableCell(this.grupoclientesForeignKey,this.grupoclienteformapagoConstantesFunciones.resaltarid_grupo_clienteGrupoClienteFormaPago,this,this.grupoclienteformapagoConstantesFunciones.activarid_grupo_clienteGrupoClienteFormaPago,true,"id_grupo_clienteGrupoClienteFormaPago","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new GrupoClienteFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGrupoClienteFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoClienteFormaPago,GrupoClienteFormaPagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO));

		if(this.grupoclienteformapagoConstantesFunciones.mostrarid_tipo_forma_pagoGrupoClienteFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GrupoClienteFormaPagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoFormaPagoTableCell(this.tipoformapagosForeignKey,this.grupoclienteformapagoConstantesFunciones.resaltarid_tipo_forma_pagoGrupoClienteFormaPago,this,this.grupoclienteformapagoConstantesFunciones.activarid_tipo_forma_pagoGrupoClienteFormaPago));
			tableColumn.setCellEditor(new TipoFormaPagoTableCell(this.tipoformapagosForeignKey,this.grupoclienteformapagoConstantesFunciones.resaltarid_tipo_forma_pagoGrupoClienteFormaPago,this,this.grupoclienteformapagoConstantesFunciones.activarid_tipo_forma_pagoGrupoClienteFormaPago,true,"id_tipo_forma_pagoGrupoClienteFormaPago","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new GrupoClienteFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosGrupoClienteFormaPago.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosGrupoClienteFormaPago.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarGrupoClienteFormaPago && this.isPermisoGuardarCambiosGrupoClienteFormaPago) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosGrupoClienteFormaPago.addColumn(tableColumn);
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
			
			this.jTableDatosGrupoClienteFormaPago.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarGrupoClienteFormaPago && this.isPermisoGuardarCambiosGrupoClienteFormaPago) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarGrupoClienteFormaPago && this.isPermisoGuardarCambiosGrupoClienteFormaPago) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosGrupoClienteFormaPago.moveColumn(this.jTableDatosGrupoClienteFormaPago.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosGrupoClienteFormaPago.moveColumn(this.jTableDatosGrupoClienteFormaPago.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosGrupoClienteFormaPago.moveColumn(this.jTableDatosGrupoClienteFormaPago.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosGrupoClienteFormaPago.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosGrupoClienteFormaPago.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosGrupoClienteFormaPago,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!GrupoClienteFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosGrupoClienteFormaPago.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosGrupoClienteFormaPago.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!GrupoClienteFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!GrupoClienteFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosGrupoClienteFormaPago.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosGrupoClienteFormaPago.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosGrupoClienteFormaPago.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=grupoclienteformapagoLogic.getGrupoClienteFormaPagos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=grupoclienteformapagos.size()-1;
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
		//this.jTableDatosGrupoClienteFormaPago.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosGrupoClienteFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosGrupoClienteFormaPago();
			
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
				
				//this.isEsNuevoGrupoClienteFormaPago=false;
					
				GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
			
				if(this.grupoclienteformapagoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormGrupoClienteFormaPago==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosGrupoClienteFormaPago.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosGrupoClienteFormaPago.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteformapago =(GrupoClienteFormaPago) this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.grupoclienteformapago =(GrupoClienteFormaPago) this.grupoclienteformapagos.toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.grupoclienteformapago.getsType().equals("DUPLICADO")
				   || this.grupoclienteformapago.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoGrupoClienteFormaPago=true;
				
				} else {
					this.isEsNuevoGrupoClienteFormaPago=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {
					if(this.grupoclienteformapago.getId()>=0 && !this.grupoclienteformapago.getIsNew()) {						
						this.isEsNuevoGrupoClienteFormaPago=false;
						
					} else {
						this.isEsNuevoGrupoClienteFormaPago=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoGrupoClienteFormaPago(esRelaciones);						
				
				this.seleccionarGrupoClienteFormaPago(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.grupoclienteformapago.getId()<0) {
					this.isEsNuevoGrupoClienteFormaPago=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarGrupoClienteFormaPago(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarGrupoClienteFormaPago(evt,rowIndex);
				}	
				
				if(this.grupoclienteformapagoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion GrupoClienteFormaPago: " + this.dDif); 
					}
				}								
				
				GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarGrupoClienteFormaPago(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.grupoclienteformapago)) {
					if(this.grupoclienteformapago.getId()>0) {
						this.grupoclienteformapago.setIsDeleted(true);
						
						this.grupoclienteformapagosEliminados.add(this.grupoclienteformapago);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().remove(this.grupoclienteformapago);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.grupoclienteformapagos.remove(this.grupoclienteformapago);				
					}
					
					
					((GrupoClienteFormaPagoModel) this.jTableDatosGrupoClienteFormaPago.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaGrupoClienteFormaPago(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarGrupoClienteFormaPago(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoGrupoClienteFormaPago) {
			
			if(this.jInternalFrameDetalleFormGrupoClienteFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosGrupoClienteFormaPago.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosGrupoClienteFormaPago.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteformapago =(GrupoClienteFormaPago) this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.grupoclienteformapago =(GrupoClienteFormaPago) this.grupoclienteformapagos.toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(GrupoClienteFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioGrupoClienteFormaPago(this.grupoclienteformapago);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.grupoclienteformapagoConstantesFunciones.cargarid_empresaGrupoClienteFormaPago || this.grupoclienteformapagoConstantesFunciones.event_dependid_empresaGrupoClienteFormaPago) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.grupoclienteformapago.getid_empresa());
									//this.inicializarActualizarBindingGrupoClienteFormaPago(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(grupoclienteformapago.getEmpresa()!=null) {
							this.empresasForeignKey.add(grupoclienteformapago.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.grupoclienteformapago.getid_empresa(),false,"Formulario");

					//GrupoCliente
					if(!this.grupoclienteformapagoConstantesFunciones.cargarid_grupo_clienteGrupoClienteFormaPago || this.grupoclienteformapagoConstantesFunciones.event_dependid_grupo_clienteGrupoClienteFormaPago) {
						//this.cargarCombosGrupoClientesForeignKeyLista(" where id="+this.grupoclienteformapago.getid_grupo_cliente());
									//this.inicializarActualizarBindingGrupoClienteFormaPago(false,false);
						this.grupoclientesForeignKey=new ArrayList<GrupoCliente>();

						if(grupoclienteformapago.getGrupoCliente()!=null) {
							this.grupoclientesForeignKey.add(grupoclienteformapago.getGrupoCliente());
						}

						this.addItemDefectoCombosForeignKeyGrupoCliente();
						this.cargarCombosFrameGrupoClientesForeignKey("Todos");
					}
					this.setActualGrupoClienteForeignKey(this.grupoclienteformapago.getid_grupo_cliente(),false,"Formulario");

					//TipoFormaPago
					if(!this.grupoclienteformapagoConstantesFunciones.cargarid_tipo_forma_pagoGrupoClienteFormaPago || this.grupoclienteformapagoConstantesFunciones.event_dependid_tipo_forma_pagoGrupoClienteFormaPago) {
						//this.cargarCombosTipoFormaPagosForeignKeyLista(" where id="+this.grupoclienteformapago.getid_tipo_forma_pago());
									//this.inicializarActualizarBindingGrupoClienteFormaPago(false,false);
						this.tipoformapagosForeignKey=new ArrayList<TipoFormaPago>();

						if(grupoclienteformapago.getTipoFormaPago()!=null) {
							this.tipoformapagosForeignKey.add(grupoclienteformapago.getTipoFormaPago());
						}

						this.addItemDefectoCombosForeignKeyTipoFormaPago();
						this.cargarCombosFrameTipoFormaPagosForeignKey("Todos");
					}
					this.setActualTipoFormaPagoForeignKey(this.grupoclienteformapago.getid_tipo_forma_pago(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesGrupoClienteFormaPago("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesGrupoClienteFormaPago(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualGrupoClienteFormaPago() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoGrupoClienteFormaPago(GrupoClienteFormaPago grupoclienteformapago) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoGrupoClienteFormaPago(grupoclienteformapago,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoGrupoClienteFormaPago(GrupoClienteFormaPago grupoclienteformapago,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioGrupoClienteFormaPago(grupoclienteformapago);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyGrupoClienteFormaPago(grupoclienteformapago,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyGrupoClienteFormaPago(grupoclienteformapago);
	}
	
	public void setVariablesObjetoActualToFormularioGrupoClienteFormaPago(GrupoClienteFormaPago grupoclienteformapago) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormGrupoClienteFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.jLabelidGrupoClienteFormaPago.setText(grupoclienteformapago.getId().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,GrupoClienteFormaPago grupoclienteformapagoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,grupoclienteformapagoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,GrupoClienteFormaPago grupoclienteformapagoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				grupoclienteformapagoLocal=this.grupoclienteformapago;
			} else {
				grupoclienteformapagoLocal=this.grupoclienteformapagoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(grupoclienteformapagoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoGrupoClienteFormaPago(grupoclienteformapagoLocal,true);
					
					if(grupoclienteformapagoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(grupoclienteformapagoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(grupoclienteformapagoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoGrupoClienteFormaPago(GrupoClienteFormaPago grupoclienteformapago,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualGrupoClienteFormaPago(grupoclienteformapago,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysGrupoClienteFormaPago(grupoclienteformapago);
	}
	
	public void setVariablesFormularioToObjetoActualGrupoClienteFormaPago(GrupoClienteFormaPago grupoclienteformapago,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualGrupoClienteFormaPago(grupoclienteformapago,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualGrupoClienteFormaPago(GrupoClienteFormaPago grupoclienteformapago,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormGrupoClienteFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormGrupoClienteFormaPago.jLabelidGrupoClienteFormaPago.getText()==null || this.jInternalFrameDetalleFormGrupoClienteFormaPago.jLabelidGrupoClienteFormaPago.getText()=="" || this.jInternalFrameDetalleFormGrupoClienteFormaPago.jLabelidGrupoClienteFormaPago.getText()=="Id") {
				this.jInternalFrameDetalleFormGrupoClienteFormaPago.jLabelidGrupoClienteFormaPago.setText("0");
			}

			if(conColumnasBase) {grupoclienteformapago.setId(Long.parseLong(this.jInternalFrameDetalleFormGrupoClienteFormaPago.jLabelidGrupoClienteFormaPago.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GrupoClienteFormaPagoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGrupoClienteFormaPago.jLabelIdGrupoClienteFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualGrupoClienteFormaPago(GrupoClienteFormaPago grupoclienteformapagoBean,GrupoClienteFormaPago grupoclienteformapago,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && grupoclienteformapagoBean.getid_grupo_cliente()!=null && !grupoclienteformapagoBean.getid_grupo_cliente().equals(-1L))) {grupoclienteformapago.setid_grupo_cliente(grupoclienteformapagoBean.getid_grupo_cliente());}
			if(conDefault || (!conDefault && grupoclienteformapagoBean.getid_tipo_forma_pago()!=null && !grupoclienteformapagoBean.getid_tipo_forma_pago().equals(-1L))) {grupoclienteformapago.setid_tipo_forma_pago(grupoclienteformapagoBean.getid_tipo_forma_pago());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosGrupoClienteFormaPago(GrupoClienteFormaPago grupoclienteformapagoOrigen,GrupoClienteFormaPago grupoclienteformapago,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && grupoclienteformapagoOrigen.getId()!=null && !grupoclienteformapagoOrigen.getId().equals(0L))) {grupoclienteformapago.setId(grupoclienteformapagoOrigen.getId());}}
			if(conDefault || (!conDefault && grupoclienteformapagoOrigen.getid_grupo_cliente()!=null && !grupoclienteformapagoOrigen.getid_grupo_cliente().equals(-1L))) {grupoclienteformapago.setid_grupo_cliente(grupoclienteformapagoOrigen.getid_grupo_cliente());}
			if(conDefault || (!conDefault && grupoclienteformapagoOrigen.getid_tipo_forma_pago()!=null && !grupoclienteformapagoOrigen.getid_tipo_forma_pago().equals(-1L))) {grupoclienteformapago.setid_tipo_forma_pago(grupoclienteformapagoOrigen.getid_tipo_forma_pago());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioGrupoClienteFormaPago(GrupoClienteFormaPago grupoclienteformapago) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.jLabelidGrupoClienteFormaPago.setText(grupoclienteformapago.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioGrupoClienteFormaPago(GrupoClienteFormaPagoBean grupoclienteformapagoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.jLabelidGrupoClienteFormaPago.setText(grupoclienteformapagoBean.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanGrupoClienteFormaPago(GrupoClienteFormaPagoParameterReturnGeneral grupoclienteformapagoReturnGeneral,GrupoClienteFormaPagoBean grupoclienteformapagoBean,Boolean conDefault) throws Exception { 
		try {
			GrupoClienteFormaPago grupoclienteformapagoLocal=new GrupoClienteFormaPago();
			
			grupoclienteformapagoLocal=grupoclienteformapagoReturnGeneral.getGrupoClienteFormaPago();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && grupoclienteformapagoLocal.getId()!=null && !grupoclienteformapagoLocal.getId().equals(0L))) {grupoclienteformapagoBean.setId(grupoclienteformapagoLocal.getId());}}
			if(conDefault || (!conDefault && grupoclienteformapagoLocal.getid_grupo_cliente()!=null && !grupoclienteformapagoLocal.getid_grupo_cliente().equals(-1L))) {grupoclienteformapagoBean.setid_grupo_cliente(grupoclienteformapagoLocal.getid_grupo_cliente());}
			if(conDefault || (!conDefault && grupoclienteformapagoLocal.getid_tipo_forma_pago()!=null && !grupoclienteformapagoLocal.getid_tipo_forma_pago().equals(-1L))) {grupoclienteformapagoBean.setid_tipo_forma_pago(grupoclienteformapagoLocal.getid_tipo_forma_pago());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxGrupoClienteFormaPagoGenerico(Long idGrupoClienteFormaPagoSeleccionado,JComboBox jComboBoxGrupoClienteFormaPago,List<GrupoClienteFormaPago> grupoclienteformapagosLocal)throws Exception {
		try {
			GrupoClienteFormaPago  grupoclienteformapagoTemp=null;

			for(GrupoClienteFormaPago grupoclienteformapagoAux:grupoclienteformapagosLocal) {
				if(grupoclienteformapagoAux.getId()!=null && grupoclienteformapagoAux.getId().equals(idGrupoClienteFormaPagoSeleccionado)) {
					grupoclienteformapagoTemp=grupoclienteformapagoAux;
					break;
				}
			}

			jComboBoxGrupoClienteFormaPago.setSelectedItem(grupoclienteformapagoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxGrupoClienteFormaPagoGenerico(JComboBox jComboBoxGrupoClienteFormaPago,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxGrupoClienteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxGrupoClienteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxGrupoClienteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxGrupoClienteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxGrupoClienteFormaPago.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxGrupoClienteFormaPago.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxGrupoClienteFormaPago.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxGrupoClienteFormaPago.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxGrupoClienteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxGrupoClienteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			grupoclienteformapago=(GrupoClienteFormaPago) grupoclienteformapagoLogic.getGrupoClienteFormaPagos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			grupoclienteformapago =(GrupoClienteFormaPago) grupoclienteformapagos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!grupoclienteformapago.getIsNew() && !grupoclienteformapago.getIsChanged() && !grupoclienteformapago.getIsDeleted()) {
				sDescripcion=grupoclienteformapago.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=grupoclienteformapago.getempresa_descripcion();
			}
		}

		if(sTipo.equals("GrupoCliente")) {
			//sDescripcion=this.getActualGrupoClienteForeignKeyDescripcion((Long)value);
			if(!grupoclienteformapago.getIsNew() && !grupoclienteformapago.getIsChanged() && !grupoclienteformapago.getIsDeleted()) {
				sDescripcion=grupoclienteformapago.getgrupocliente_descripcion();
			} else {
				//sDescripcion=this.getActualGrupoClienteForeignKeyDescripcion((Long)value);
				sDescripcion=grupoclienteformapago.getgrupocliente_descripcion();
			}
		}

		if(sTipo.equals("TipoFormaPago")) {
			//sDescripcion=this.getActualTipoFormaPagoForeignKeyDescripcion((Long)value);
			if(!grupoclienteformapago.getIsNew() && !grupoclienteformapago.getIsChanged() && !grupoclienteformapago.getIsDeleted()) {
				sDescripcion=grupoclienteformapago.gettipoformapago_descripcion();
			} else {
				//sDescripcion=this.getActualTipoFormaPagoForeignKeyDescripcion((Long)value);
				sDescripcion=grupoclienteformapago.gettipoformapago_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		GrupoClienteFormaPago grupoclienteformapagoRow=new GrupoClienteFormaPago();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			grupoclienteformapagoRow=(GrupoClienteFormaPago) grupoclienteformapagoLogic.getGrupoClienteFormaPagos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			grupoclienteformapagoRow=(GrupoClienteFormaPago) grupoclienteformapagos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualGrupoClienteFormaPago(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoGrupoClienteFormaPago.setVisible((this.isVisibilidadCeldaNuevoGrupoClienteFormaPago && this.isPermisoNuevoGrupoClienteFormaPago));			
			this.jButtonDuplicarGrupoClienteFormaPago.setVisible((this.isVisibilidadCeldaDuplicarGrupoClienteFormaPago && this.isPermisoDuplicarGrupoClienteFormaPago));			
			this.jButtonCopiarGrupoClienteFormaPago.setVisible((this.isVisibilidadCeldaCopiarGrupoClienteFormaPago && this.isPermisoCopiarGrupoClienteFormaPago));
			this.jButtonVerFormGrupoClienteFormaPago.setVisible((this.isVisibilidadCeldaVerFormGrupoClienteFormaPago && this.isPermisoVerFormGrupoClienteFormaPago));
			
			this.jButtonAbrirOrderByGrupoClienteFormaPago.setVisible((this.isVisibilidadCeldaOrdenGrupoClienteFormaPago && this.isPermisoOrdenGrupoClienteFormaPago));			
			
			this.jButtonNuevoRelacionesGrupoClienteFormaPago.setVisible((this.isVisibilidadCeldaNuevoRelacionesGrupoClienteFormaPago && this.isPermisoNuevoGrupoClienteFormaPago));			
			this.jButtonNuevoGuardarCambiosGrupoClienteFormaPago.setVisible((this.isVisibilidadCeldaNuevoGrupoClienteFormaPago && this.isPermisoNuevoGrupoClienteFormaPago && this.isPermisoGuardarCambiosGrupoClienteFormaPago));
			
			if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) {
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonModificarGrupoClienteFormaPago.setVisible((this.isVisibilidadCeldaModificarGrupoClienteFormaPago && this.isPermisoActualizarGrupoClienteFormaPago));	
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonActualizarGrupoClienteFormaPago.setVisible((this.isVisibilidadCeldaActualizarGrupoClienteFormaPago && this.isPermisoActualizarGrupoClienteFormaPago));	
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonEliminarGrupoClienteFormaPago.setVisible((this.isVisibilidadCeldaEliminarGrupoClienteFormaPago && this.isPermisoEliminarGrupoClienteFormaPago));
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonCancelarGrupoClienteFormaPago.setVisible(this.isVisibilidadCeldaCancelarGrupoClienteFormaPago);							
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonGuardarCambiosGrupoClienteFormaPago.setVisible((this.isVisibilidadCeldaGuardarGrupoClienteFormaPago && this.isPermisoGuardarCambiosGrupoClienteFormaPago));			
			
			}
						
			this.jButtonGuardarCambiosTablaGrupoClienteFormaPago.setVisible((this.isVisibilidadCeldaGuardarCambiosGrupoClienteFormaPago && this.isPermisoGuardarCambiosGrupoClienteFormaPago));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarGrupoClienteFormaPago.setVisible((this.isVisibilidadCeldaNuevoGrupoClienteFormaPago && this.isPermisoNuevoGrupoClienteFormaPago));						
			this.jButtonDuplicarToolBarGrupoClienteFormaPago.setVisible((this.isVisibilidadCeldaDuplicarGrupoClienteFormaPago && this.isPermisoDuplicarGrupoClienteFormaPago));						
			this.jButtonCopiarToolBarGrupoClienteFormaPago.setVisible((this.isVisibilidadCeldaCopiarGrupoClienteFormaPago && this.isPermisoCopiarGrupoClienteFormaPago));			
			this.jButtonVerFormToolBarGrupoClienteFormaPago.setVisible((this.isVisibilidadCeldaVerFormGrupoClienteFormaPago && this.isPermisoVerFormGrupoClienteFormaPago));			
			this.jButtonAbrirOrderByToolBarGrupoClienteFormaPago.setVisible((this.isVisibilidadCeldaOrdenGrupoClienteFormaPago && this.isPermisoOrdenGrupoClienteFormaPago));
			this.jButtonNuevoRelacionesToolBarGrupoClienteFormaPago.setVisible((this.isVisibilidadCeldaNuevoRelacionesGrupoClienteFormaPago && this.isPermisoNuevoGrupoClienteFormaPago));			
			this.jButtonNuevoGuardarCambiosToolBarGrupoClienteFormaPago.setVisible((this.isVisibilidadCeldaNuevoGrupoClienteFormaPago && this.isPermisoNuevoGrupoClienteFormaPago && this.isPermisoGuardarCambiosGrupoClienteFormaPago));			
			
			if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) {
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonModificarToolBarGrupoClienteFormaPago.setVisible((this.isVisibilidadCeldaModificarGrupoClienteFormaPago && this.isPermisoActualizarGrupoClienteFormaPago));	
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonActualizarToolBarGrupoClienteFormaPago.setVisible((this.isVisibilidadCeldaActualizarGrupoClienteFormaPago  && this.isPermisoActualizarGrupoClienteFormaPago));	
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonEliminarToolBarGrupoClienteFormaPago.setVisible((this.isVisibilidadCeldaEliminarGrupoClienteFormaPago && this.isPermisoEliminarGrupoClienteFormaPago));
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonCancelarToolBarGrupoClienteFormaPago.setVisible(this.isVisibilidadCeldaCancelarGrupoClienteFormaPago);				
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonGuardarCambiosToolBarGrupoClienteFormaPago.setVisible((this.isVisibilidadCeldaGuardarGrupoClienteFormaPago && this.isPermisoGuardarCambiosGrupoClienteFormaPago));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarGrupoClienteFormaPago.setVisible((this.isVisibilidadCeldaGuardarCambiosGrupoClienteFormaPago && this.isPermisoGuardarCambiosGrupoClienteFormaPago));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoGrupoClienteFormaPago.setVisible((this.isVisibilidadCeldaNuevoGrupoClienteFormaPago && this.isPermisoNuevoGrupoClienteFormaPago));			
			this.jMenuItemDuplicarGrupoClienteFormaPago.setVisible((this.isVisibilidadCeldaDuplicarGrupoClienteFormaPago && this.isPermisoDuplicarGrupoClienteFormaPago));			
			this.jMenuItemCopiarGrupoClienteFormaPago.setVisible((this.isVisibilidadCeldaCopiarGrupoClienteFormaPago && this.isPermisoCopiarGrupoClienteFormaPago));			
			this.jMenuItemVerFormGrupoClienteFormaPago.setVisible((this.isVisibilidadCeldaVerFormGrupoClienteFormaPago && this.isPermisoVerFormGrupoClienteFormaPago));			
			this.jMenuItemAbrirOrderByGrupoClienteFormaPago.setVisible((this.isVisibilidadCeldaOrdenGrupoClienteFormaPago && this.isPermisoOrdenGrupoClienteFormaPago));			
			//this.jMenuItemMostrarOcultarGrupoClienteFormaPago.setVisible((this.isVisibilidadCeldaOrdenGrupoClienteFormaPago && this.isPermisoOrdenGrupoClienteFormaPago));
			this.jMenuItemDetalleAbrirOrderByGrupoClienteFormaPago.setVisible((this.isVisibilidadCeldaOrdenGrupoClienteFormaPago && this.isPermisoOrdenGrupoClienteFormaPago));			
			//this.jMenuItemDetalleMostrarOcultarGrupoClienteFormaPago.setVisible((this.isVisibilidadCeldaOrdenGrupoClienteFormaPago && this.isPermisoOrdenGrupoClienteFormaPago));			
			this.jMenuItemNuevoRelacionesGrupoClienteFormaPago.setVisible((this.isVisibilidadCeldaNuevoRelacionesGrupoClienteFormaPago && this.isPermisoNuevoGrupoClienteFormaPago));			
			this.jMenuItemNuevoGuardarCambiosGrupoClienteFormaPago.setVisible((this.isVisibilidadCeldaNuevoGrupoClienteFormaPago && this.isPermisoNuevoGrupoClienteFormaPago && this.isPermisoGuardarCambiosGrupoClienteFormaPago));									
			
			if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) {
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.jMenuItemModificarGrupoClienteFormaPago.setVisible((this.isVisibilidadCeldaModificarGrupoClienteFormaPago && this.isPermisoActualizarGrupoClienteFormaPago));	
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.jMenuItemActualizarGrupoClienteFormaPago.setVisible((this.isVisibilidadCeldaActualizarGrupoClienteFormaPago && this.isPermisoActualizarGrupoClienteFormaPago));	
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.jMenuItemEliminarGrupoClienteFormaPago.setVisible((this.isVisibilidadCeldaEliminarGrupoClienteFormaPago && this.isPermisoEliminarGrupoClienteFormaPago));
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.jMenuItemCancelarGrupoClienteFormaPago.setVisible(this.isVisibilidadCeldaCancelarGrupoClienteFormaPago);				
			}
			
			this.jMenuItemGuardarCambiosGrupoClienteFormaPago.setVisible((this.isVisibilidadCeldaGuardarGrupoClienteFormaPago && this.isPermisoGuardarCambiosGrupoClienteFormaPago));						
			this.jMenuItemGuardarCambiosTablaGrupoClienteFormaPago.setVisible((this.isVisibilidadCeldaGuardarCambiosGrupoClienteFormaPago && this.isPermisoGuardarCambiosGrupoClienteFormaPago));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoGrupoClienteFormaPago=this.jButtonNuevoGrupoClienteFormaPago.isVisible();
			this.isVisibilidadCeldaDuplicarGrupoClienteFormaPago=this.jButtonDuplicarGrupoClienteFormaPago.isVisible();
			this.isVisibilidadCeldaCopiarGrupoClienteFormaPago=this.jButtonCopiarGrupoClienteFormaPago.isVisible();
			this.isVisibilidadCeldaVerFormGrupoClienteFormaPago=this.jButtonVerFormGrupoClienteFormaPago.isVisible();
			
			this.isVisibilidadCeldaOrdenGrupoClienteFormaPago=this.jButtonAbrirOrderByGrupoClienteFormaPago.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesGrupoClienteFormaPago=this.jButtonNuevoRelacionesGrupoClienteFormaPago.isVisible();
			this.isVisibilidadCeldaModificarGrupoClienteFormaPago=this.jButtonModificarGrupoClienteFormaPago.isVisible();
			
			if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) {
			this.isVisibilidadCeldaActualizarGrupoClienteFormaPago=this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonActualizarGrupoClienteFormaPago.isVisible();
			this.isVisibilidadCeldaEliminarGrupoClienteFormaPago=this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonEliminarGrupoClienteFormaPago.isVisible();
			this.isVisibilidadCeldaCancelarGrupoClienteFormaPago=this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonCancelarGrupoClienteFormaPago.isVisible();
			this.isVisibilidadCeldaGuardarGrupoClienteFormaPago=this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonGuardarCambiosGrupoClienteFormaPago.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosGrupoClienteFormaPago=this.jButtonGuardarCambiosTablaGrupoClienteFormaPago.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoGrupoClienteFormaPago=this.jButtonNuevoToolBarGrupoClienteFormaPago.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesGrupoClienteFormaPago=this.jButtonNuevoRelacionesToolBarGrupoClienteFormaPago.isVisible();
			
			if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) {
			this.isVisibilidadCeldaModificarGrupoClienteFormaPago=this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonModificarToolBarGrupoClienteFormaPago.isVisible();
			this.isVisibilidadCeldaActualizarGrupoClienteFormaPago=this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonActualizarToolBarGrupoClienteFormaPago.isVisible();
			this.isVisibilidadCeldaEliminarGrupoClienteFormaPago=this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonEliminarToolBarGrupoClienteFormaPago.isVisible();
			this.isVisibilidadCeldaCancelarGrupoClienteFormaPago=this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonCancelarToolBarGrupoClienteFormaPago.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarGrupoClienteFormaPago=this.jButtonGuardarCambiosToolBarGrupoClienteFormaPago.isVisible();
			this.isVisibilidadCeldaGuardarCambiosGrupoClienteFormaPago=this.jButtonGuardarCambiosTablaToolBarGrupoClienteFormaPago.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoGrupoClienteFormaPago=this.jMenuItemNuevoGrupoClienteFormaPago.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesGrupoClienteFormaPago=this.jMenuItemNuevoRelacionesGrupoClienteFormaPago.isVisible();
			
			if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) {
			this.isVisibilidadCeldaModificarGrupoClienteFormaPago=this.jInternalFrameDetalleFormGrupoClienteFormaPago.jMenuItemModificarGrupoClienteFormaPago.isVisible();
			this.isVisibilidadCeldaActualizarGrupoClienteFormaPago=this.jInternalFrameDetalleFormGrupoClienteFormaPago.jMenuItemActualizarGrupoClienteFormaPago.isVisible();
			this.isVisibilidadCeldaEliminarGrupoClienteFormaPago=this.jInternalFrameDetalleFormGrupoClienteFormaPago.jMenuItemEliminarGrupoClienteFormaPago.isVisible();
			this.isVisibilidadCeldaCancelarGrupoClienteFormaPago=this.jInternalFrameDetalleFormGrupoClienteFormaPago.jMenuItemCancelarGrupoClienteFormaPago.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarGrupoClienteFormaPago=this.jMenuItemGuardarCambiosGrupoClienteFormaPago.isVisible();
			this.isVisibilidadCeldaGuardarCambiosGrupoClienteFormaPago=this.jMenuItemGuardarCambiosTablaGrupoClienteFormaPago.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesGrupoClienteFormaPago(Boolean esInicializar) {
		if(GrupoClienteFormaPagoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.grupoclienteformapagoSessionBean.getConGuardarRelaciones()) {
				//if(this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesGrupoClienteFormaPago();
			}
			
			this.inicializarActualizarBindingBotonesManualGrupoClienteFormaPago(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualGrupoClienteFormaPago() {
		this.jButtonNuevoGrupoClienteFormaPago.setVisible(this.isPermisoNuevoGrupoClienteFormaPago);			
		this.jButtonDuplicarGrupoClienteFormaPago.setVisible(this.isPermisoDuplicarGrupoClienteFormaPago);			
		this.jButtonCopiarGrupoClienteFormaPago.setVisible(this.isPermisoCopiarGrupoClienteFormaPago);			
		this.jButtonVerFormGrupoClienteFormaPago.setVisible(this.isPermisoVerFormGrupoClienteFormaPago);			
		
		this.jButtonAbrirOrderByGrupoClienteFormaPago.setVisible(this.isPermisoOrdenGrupoClienteFormaPago);					
		
		this.jButtonNuevoRelacionesGrupoClienteFormaPago.setVisible(this.isPermisoNuevoGrupoClienteFormaPago);			
		
		if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonModificarGrupoClienteFormaPago.setVisible(this.isPermisoActualizarGrupoClienteFormaPago);	
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonActualizarGrupoClienteFormaPago.setVisible(this.isPermisoActualizarGrupoClienteFormaPago);	
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonEliminarGrupoClienteFormaPago.setVisible(this.isPermisoEliminarGrupoClienteFormaPago);
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonCancelarGrupoClienteFormaPago.setVisible(this.isVisibilidadCeldaCancelarGrupoClienteFormaPago);						
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonGuardarCambiosGrupoClienteFormaPago.setVisible(this.isPermisoGuardarCambiosGrupoClienteFormaPago);							
		}
		
		this.jButtonGuardarCambiosTablaGrupoClienteFormaPago.setVisible(this.isPermisoActualizarGrupoClienteFormaPago);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleGrupoClienteFormaPago() {
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonModificarGrupoClienteFormaPago.setVisible(this.isPermisoActualizarGrupoClienteFormaPago);	
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonActualizarGrupoClienteFormaPago.setVisible(this.isPermisoActualizarGrupoClienteFormaPago);	
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonEliminarGrupoClienteFormaPago.setVisible(this.isPermisoEliminarGrupoClienteFormaPago);
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonCancelarGrupoClienteFormaPago.setVisible(this.isVisibilidadCeldaCancelarGrupoClienteFormaPago);							
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonGuardarCambiosGrupoClienteFormaPago.setVisible((this.isVisibilidadCeldaGuardarGrupoClienteFormaPago && this.isPermisoGuardarCambiosGrupoClienteFormaPago));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosGrupoClienteFormaPago() {
		if(GrupoClienteFormaPagoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualGrupoClienteFormaPago();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesGrupoClienteFormaPago() {
	}
	
	public void jTableDatosGrupoClienteFormaPagoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarGrupoClienteFormaPago(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidGrupoClienteFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGrupoClienteFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGrupoClienteFormaPago(this.getgrupoclienteformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoClienteFormaPago(this.grupoclienteformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupoclienteformapago =(GrupoClienteFormaPago) this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.grupoclienteformapago =(GrupoClienteFormaPago) this.grupoclienteformapagos.toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.grupoclienteformapago==null) {
						this.grupoclienteformapago = new GrupoClienteFormaPago();
					}

					this.setVariablesFormularioToObjetoActualGrupoClienteFormaPago(this.grupoclienteformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoClienteFormaPago(this.grupoclienteformapago);
				}

				if(this.grupoclienteformapago.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.grupoclienteformapago.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGrupoClienteFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaGrupoClienteFormaPagoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebGrupoClienteFormaPago(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGrupoClienteFormaPago.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosGrupoClienteFormaPago.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosGrupoClienteFormaPago.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteformapago =(GrupoClienteFormaPago) this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.grupoclienteformapago =(GrupoClienteFormaPago) this.grupoclienteformapagos.toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualGrupoClienteFormaPago(this.getgrupoclienteformapago(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysGrupoClienteFormaPago(this.grupoclienteformapago);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.grupoclienteformapagoLogic.getConnexion());

				if(this.grupoclienteformapago.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.grupoclienteformapago.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderGrupoClienteFormaPago=(TitledBorder)this.jScrollPanelDatosGrupoClienteFormaPago.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderGrupoClienteFormaPago.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaGrupoClienteFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGrupoClienteFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGrupoClienteFormaPago(this.getgrupoclienteformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoClienteFormaPago(this.grupoclienteformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupoclienteformapago =(GrupoClienteFormaPago) this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.grupoclienteformapago =(GrupoClienteFormaPago) this.grupoclienteformapagos.toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.grupoclienteformapago==null) {
						this.grupoclienteformapago = new GrupoClienteFormaPago();
					}

					this.setVariablesFormularioToObjetoActualGrupoClienteFormaPago(this.grupoclienteformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoClienteFormaPago(this.grupoclienteformapago);
				}

				if(this.grupoclienteformapago.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.grupoclienteformapago.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGrupoClienteFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_grupo_clienteGrupoClienteFormaPagoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisogrupocliente=true;

			idTienePermisogrupocliente=this.tienePermisosUsuarioEnPaginaWebGrupoClienteFormaPago(GrupoClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisogrupocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGrupoClienteFormaPago.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosGrupoClienteFormaPago.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosGrupoClienteFormaPago.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteformapago =(GrupoClienteFormaPago) this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.grupoclienteformapago =(GrupoClienteFormaPago) this.grupoclienteformapagos.toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualGrupoClienteFormaPago(this.getgrupoclienteformapago(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysGrupoClienteFormaPago(this.grupoclienteformapago);

				this.grupoclienteBeanSwingJInternalFrame=new GrupoClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.grupoclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.grupoclienteBeanSwingJInternalFrame.getGrupoClienteLogic().setConnexion(this.grupoclienteformapagoLogic.getConnexion());

				if(this.grupoclienteformapago.getid_grupo_cliente()!=null) {
					this.grupoclienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.grupoclienteBeanSwingJInternalFrame.setIdActual(this.grupoclienteformapago.getid_grupo_cliente());
					this.grupoclienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.grupoclienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.grupoclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaGrupoCliente();
				}

				JInternalFrameBase jinternalFrame =this.grupoclienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderGrupoClienteFormaPago=(TitledBorder)this.jScrollPanelDatosGrupoClienteFormaPago.getBorder();
				TitledBorder titledBordergrupocliente=(TitledBorder)this.grupoclienteBeanSwingJInternalFrame.jScrollPanelDatosGrupoCliente.getBorder();

				titledBordergrupocliente.setTitle(titledBorderGrupoClienteFormaPago.getTitle() + " -> Grupo Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_grupo_clienteGrupoClienteFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGrupoClienteFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGrupoClienteFormaPago(this.getgrupoclienteformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoClienteFormaPago(this.grupoclienteformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupoclienteformapago =(GrupoClienteFormaPago) this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.grupoclienteformapago =(GrupoClienteFormaPago) this.grupoclienteformapagos.toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.grupoclienteformapago==null) {
						this.grupoclienteformapago = new GrupoClienteFormaPago();
					}

					this.setVariablesFormularioToObjetoActualGrupoClienteFormaPago(this.grupoclienteformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoClienteFormaPago(this.grupoclienteformapago);
				}

				if(this.grupoclienteformapago.getid_grupo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_grupo_cliente = "+this.grupoclienteformapago.getid_grupo_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGrupoClienteFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_forma_pagoGrupoClienteFormaPagoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoformapago=true;

			idTienePermisotipoformapago=this.tienePermisosUsuarioEnPaginaWebGrupoClienteFormaPago(TipoFormaPagoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoformapago) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGrupoClienteFormaPago.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosGrupoClienteFormaPago.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosGrupoClienteFormaPago.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteformapago =(GrupoClienteFormaPago) this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.grupoclienteformapago =(GrupoClienteFormaPago) this.grupoclienteformapagos.toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualGrupoClienteFormaPago(this.getgrupoclienteformapago(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysGrupoClienteFormaPago(this.grupoclienteformapago);

				this.tipoformapagoBeanSwingJInternalFrame=new TipoFormaPagoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoformapagoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoformapagoBeanSwingJInternalFrame.getTipoFormaPagoLogic().setConnexion(this.grupoclienteformapagoLogic.getConnexion());

				if(this.grupoclienteformapago.getid_tipo_forma_pago()!=null) {
					this.tipoformapagoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoformapagoBeanSwingJInternalFrame.setIdActual(this.grupoclienteformapago.getid_tipo_forma_pago());
					this.tipoformapagoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoformapagoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoformapagoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoFormaPago();
				}

				JInternalFrameBase jinternalFrame =this.tipoformapagoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderGrupoClienteFormaPago=(TitledBorder)this.jScrollPanelDatosGrupoClienteFormaPago.getBorder();
				TitledBorder titledBordertipoformapago=(TitledBorder)this.tipoformapagoBeanSwingJInternalFrame.jScrollPanelDatosTipoFormaPago.getBorder();

				titledBordertipoformapago.setTitle(titledBorderGrupoClienteFormaPago.getTitle() + " -> Tipo Forma Pago");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_forma_pagoGrupoClienteFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGrupoClienteFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGrupoClienteFormaPago(this.getgrupoclienteformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoClienteFormaPago(this.grupoclienteformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupoclienteformapago =(GrupoClienteFormaPago) this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.grupoclienteformapago =(GrupoClienteFormaPago) this.grupoclienteformapagos.toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.grupoclienteformapago==null) {
						this.grupoclienteformapago = new GrupoClienteFormaPago();
					}

					this.setVariablesFormularioToObjetoActualGrupoClienteFormaPago(this.grupoclienteformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoClienteFormaPago(this.grupoclienteformapago);
				}

				if(this.grupoclienteformapago.getid_tipo_forma_pago()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_forma_pago = "+this.grupoclienteformapago.getid_tipo_forma_pago().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGrupoClienteFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaGrupoClienteFormaPagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingGrupoClienteFormaPago(false,false);

			this.getGrupoClienteFormaPagosFK_IdEmpresa();

			this.inicializarActualizarBindingGrupoClienteFormaPago(false);

			//if(GrupoClienteFormaPagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingGrupoClienteFormaPago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdGrupoClienteGrupoClienteFormaPagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingGrupoClienteFormaPago(false,false);

			this.getGrupoClienteFormaPagosFK_IdGrupoCliente();

			this.inicializarActualizarBindingGrupoClienteFormaPago(false);

			//if(GrupoClienteFormaPagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingGrupoClienteFormaPago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoFormaPagoGrupoClienteFormaPagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingGrupoClienteFormaPago(false,false);

			this.getGrupoClienteFormaPagosFK_IdTipoFormaPago();

			this.inicializarActualizarBindingGrupoClienteFormaPago(false);

			//if(GrupoClienteFormaPagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingGrupoClienteFormaPago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoclienteformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameGrupoClienteFormaPago() {
		if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) {
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.setVisible(false);	    			
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.dispose();
			this.jInternalFrameDetalleFormGrupoClienteFormaPago=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoGrupoClienteFormaPago!=null) {
			this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.dispose();
			this.jInternalFrameReporteDinamicoGrupoClienteFormaPago=null;
		}
		
		if(this.jInternalFrameImportacionGrupoClienteFormaPago!=null) {
			this.jInternalFrameImportacionGrupoClienteFormaPago.setVisible(false);	    			
			this.jInternalFrameImportacionGrupoClienteFormaPago.dispose();
			this.jInternalFrameImportacionGrupoClienteFormaPago=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessGrupoClienteFormaPago();
			
			GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
			
			
			if(sTipo.equals("NuevoGrupoClienteFormaPago")) {
				jButtonNuevoGrupoClienteFormaPagoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarGrupoClienteFormaPago")) {
				jButtonDuplicarGrupoClienteFormaPagoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarGrupoClienteFormaPago")) {
				jButtonCopiarGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("VerFormGrupoClienteFormaPago")) {
				jButtonVerFormGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarGrupoClienteFormaPago")) {
				jButtonNuevoGrupoClienteFormaPagoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarGrupoClienteFormaPago")) {
				jButtonDuplicarGrupoClienteFormaPagoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoGrupoClienteFormaPago")) {
				jButtonNuevoGrupoClienteFormaPagoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarGrupoClienteFormaPago")) {
				jButtonDuplicarGrupoClienteFormaPagoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesGrupoClienteFormaPago")) {
				jButtonNuevoGrupoClienteFormaPagoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarGrupoClienteFormaPago")) {
				jButtonNuevoGrupoClienteFormaPagoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesGrupoClienteFormaPago")) {
				jButtonNuevoGrupoClienteFormaPagoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarGrupoClienteFormaPago")) {
				jButtonModificarGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarGrupoClienteFormaPago")) {
				jButtonModificarGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarGrupoClienteFormaPago")) {
				jButtonModificarGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarGrupoClienteFormaPago")) {
				jButtonActualizarGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarGrupoClienteFormaPago")) {
				jButtonActualizarGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarGrupoClienteFormaPago")) {
				jButtonActualizarGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("EliminarGrupoClienteFormaPago")) {
				jButtonEliminarGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarGrupoClienteFormaPago")) {
				jButtonEliminarGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarGrupoClienteFormaPago")) {
				jButtonEliminarGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("CancelarGrupoClienteFormaPago")) {
				jButtonCancelarGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarGrupoClienteFormaPago")) {
				jButtonCancelarGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarGrupoClienteFormaPago")) {
				jButtonCancelarGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("CerrarGrupoClienteFormaPago")) {
				jButtonCerrarGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarGrupoClienteFormaPago")) {
				jButtonCerrarGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarGrupoClienteFormaPago")) {
				jButtonCerrarGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarGrupoClienteFormaPago")) {
				jButtonMostrarOcultarGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarGrupoClienteFormaPago")) {
				jButtonCancelarGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosGrupoClienteFormaPago")) {
				jButtonGuardarCambiosGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarGrupoClienteFormaPago")) {
				jButtonGuardarCambiosGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarGrupoClienteFormaPago")) {
				jButtonCopiarGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarGrupoClienteFormaPago")) {
				jButtonVerFormGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosGrupoClienteFormaPago")) {
				jButtonGuardarCambiosGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarGrupoClienteFormaPago")) {
				jButtonCopiarGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormGrupoClienteFormaPago")) {
				jButtonVerFormGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaGrupoClienteFormaPago")) {
				jButtonGuardarCambiosGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarGrupoClienteFormaPago")) {
				jButtonGuardarCambiosGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaGrupoClienteFormaPago")) {
				jButtonGuardarCambiosGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionGrupoClienteFormaPago")) {
				jButtonRecargarInformacionGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarGrupoClienteFormaPago")) {
				jButtonRecargarInformacionGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionGrupoClienteFormaPago")) {
				jButtonRecargarInformacionGrupoClienteFormaPagoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresGrupoClienteFormaPago")) {
				jButtonAnterioresGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarGrupoClienteFormaPago")) {
				jButtonAnterioresGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreGrupoClienteFormaPago")) {
				jButtonAnterioresGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesGrupoClienteFormaPago")) {
				jButtonSiguientesGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarGrupoClienteFormaPago")) {
				jButtonSiguientesGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesGrupoClienteFormaPago")) {
				jButtonSiguientesGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByGrupoClienteFormaPago") || sTipo.equals("MenuItemDetalleAbrirOrderByGrupoClienteFormaPago")) {
				jButtonAbrirOrderByGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarGrupoClienteFormaPago") || sTipo.equals("MenuItemDetalleMostrarOcultarGrupoClienteFormaPago")) {
				jButtonMostrarOcultarGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosGrupoClienteFormaPago")) {
				jButtonNuevoGuardarCambiosGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarGrupoClienteFormaPago")) {
				jButtonNuevoGuardarCambiosGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosGrupoClienteFormaPago")) {
				jButtonNuevoGuardarCambiosGrupoClienteFormaPagoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoGrupoClienteFormaPago")) {
				jButtonCerrarReporteDinamicoGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoGrupoClienteFormaPago")) {
				jButtonGenerarReporteDinamicoGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoGrupoClienteFormaPago")) {
				
				jButtonGenerarExcelReporteDinamicoGrupoClienteFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionGrupoClienteFormaPago")) {
				jButtonCerrarImportacionGrupoClienteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionGrupoClienteFormaPago")) {
				
				jButtonGenerarImportacionGrupoClienteFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionGrupoClienteFormaPago")) {
				
				jButtonAbrirImportacionGrupoClienteFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesGrupoClienteFormaPago")) {
				jComboBoxTiposAccionesGrupoClienteFormaPagoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesGrupoClienteFormaPago")) {
				jComboBoxTiposRelacionesGrupoClienteFormaPagoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioGrupoClienteFormaPago")) {
				jComboBoxTiposAccionesGrupoClienteFormaPagoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarGrupoClienteFormaPago")) {
				
				jComboBoxTiposSeleccionarGrupoClienteFormaPagoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralGrupoClienteFormaPago")) {
				jTextFieldValorCampoGeneralGrupoClienteFormaPagoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByGrupoClienteFormaPago")) {
				jButtonAbrirOrderByGrupoClienteFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarGrupoClienteFormaPago")) {
				jButtonAbrirOrderByGrupoClienteFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByGrupoClienteFormaPago")) {
				jButtonCerrarOrderByGrupoClienteFormaPagoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idGrupoClienteFormaPagoBusqueda")) {
				this.jButtonidGrupoClienteFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaGrupoClienteFormaPagoUpdate")) {
				this.jButtonid_empresaGrupoClienteFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaGrupoClienteFormaPagoBusqueda")) {
				this.jButtonid_empresaGrupoClienteFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_grupo_clienteGrupoClienteFormaPagoUpdate")) {
				this.jButtonid_grupo_clienteGrupoClienteFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_grupo_clienteGrupoClienteFormaPagoBusqueda")) {
				this.jButtonid_grupo_clienteGrupoClienteFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_forma_pagoGrupoClienteFormaPagoUpdate")) {
				this.jButtonid_tipo_forma_pagoGrupoClienteFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_forma_pagoGrupoClienteFormaPagoBusqueda")) {
				this.jButtonid_tipo_forma_pagoGrupoClienteFormaPagoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdGrupoClienteGrupoClienteFormaPago")) {
				this.jButtonFK_IdGrupoClienteGrupoClienteFormaPagoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoFormaPagoGrupoClienteFormaPago")) {
				this.jButtonFK_IdTipoFormaPagoGrupoClienteFormaPagoActionPerformed(evt);
			}
			
			;
			
			
			GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessGrupoClienteFormaPago();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGrupoClienteFormaPagoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoclienteformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupoclienteformapago);
				
				GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
				
				


				
				GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoClienteFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoClienteFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			GrupoClienteFormaPago grupoclienteformapagoLocal=null;
			
			if(!this.getEsControlTabla()) {
				grupoclienteformapagoLocal=this.grupoclienteformapago;
			} else {
				grupoclienteformapagoLocal=this.grupoclienteformapagoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoclienteformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupoclienteformapago);
				
				GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
							
				
				


				
				GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoClienteFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoClienteFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGrupoClienteFormaPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGrupoClienteFormaPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteformapagoAnterior =(GrupoClienteFormaPago) this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.grupoclienteformapagoAnterior =(GrupoClienteFormaPago) this.grupoclienteformapagos.toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
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
			
			GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
			
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
			
			


			
			GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGrupoClienteFormaPagoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoclienteformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupoclienteformapago);
				
				GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
								
						
				


				
				GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoClienteFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoClienteFormaPago.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoclienteformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupoclienteformapago);
				
				GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
								
				
				


				
				GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoClienteFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoClienteFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGrupoClienteFormaPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGrupoClienteFormaPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteformapagoAnterior =(GrupoClienteFormaPago) this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.grupoclienteformapagoAnterior =(GrupoClienteFormaPago) this.grupoclienteformapagos.toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoclienteformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupoclienteformapago);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGrupoClienteFormaPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGrupoClienteFormaPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteformapagoAnterior =(GrupoClienteFormaPago) this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.grupoclienteformapagoAnterior =(GrupoClienteFormaPago) this.grupoclienteformapagos.toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGrupoClienteFormaPagoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoclienteformapago);
			
			this.actualizarInformacion("INFO_PADRE",false,this.grupoclienteformapago);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoclienteformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupoclienteformapago);
				
				GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
							
				
				


				
				GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoClienteFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoClienteFormaPago.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGrupoClienteFormaPagoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosGrupoClienteFormaPago.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupoclienteformapagoAnterior =(GrupoClienteFormaPago) this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.grupoclienteformapagoAnterior =(GrupoClienteFormaPago) this.grupoclienteformapagos.toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
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
			
			GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
			
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
			
			


			
			GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGrupoClienteFormaPagoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoclienteformapago);
			
			this.actualizarInformacion("INFO_PADRE",false,this.grupoclienteformapago);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoclienteformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupoclienteformapago);
				
				GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
								
				
				


				
				GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoClienteFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoClienteFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGrupoClienteFormaPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGrupoClienteFormaPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteformapagoAnterior =(GrupoClienteFormaPago) this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.grupoclienteformapagoAnterior =(GrupoClienteFormaPago) this.grupoclienteformapagos.toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGrupoClienteFormaPagoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoclienteformapago);
			
			this.actualizarInformacion("INFO_PADRE",false,this.grupoclienteformapago);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGrupoClienteFormaPagoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoclienteformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupoclienteformapago);
				
				GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosGrupoClienteFormaPago")) {
					jCheckBoxSeleccionarTodosGrupoClienteFormaPagoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosGrupoClienteFormaPago")) {
					jCheckBoxSeleccionadosGrupoClienteFormaPagoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarGrupoClienteFormaPago")) {
					
				}
				
				


				
				
				GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoClienteFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoClienteFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoclienteformapago);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.grupoclienteformapago);
				
				GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
												
				
				


				
				
				GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoClienteFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoClienteFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGrupoClienteFormaPagoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosGrupoClienteFormaPago.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupoclienteformapagoAnterior =(GrupoClienteFormaPago) this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.grupoclienteformapagoAnterior =(GrupoClienteFormaPago) this.grupoclienteformapagos.toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGrupoClienteFormaPagoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoclienteformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupoclienteformapago);
				
				GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
				
				
				GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
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
			
			GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
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
			
			


			
			GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGrupoClienteFormaPagoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoclienteformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupoclienteformapago);
				
				GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoClienteFormaPago.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoClienteFormaPago.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoclienteformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupoclienteformapago);
				
				GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
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
				
				


				
				GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoClienteFormaPago.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoClienteFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGrupoClienteFormaPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGrupoClienteFormaPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoclienteformapagoAnterior =(GrupoClienteFormaPago) this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.grupoclienteformapagoAnterior =(GrupoClienteFormaPago) this.grupoclienteformapagos.toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarGrupoClienteFormaPago")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosGrupoClienteFormaPagoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosGrupoClienteFormaPago.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.grupoclienteformapago =(GrupoClienteFormaPago) this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.grupoclienteformapago =(GrupoClienteFormaPago) this.grupoclienteformapagos.toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.grupoclienteformapago);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarGrupoClienteFormaPago")) {
				
				}
				
				GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarGrupoClienteFormaPago")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosGrupoClienteFormaPago.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarGrupoClienteFormaPago")) {
			
			}
			
			GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessGrupoClienteFormaPago();
			
			GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
			
			if(sTipo.equals("NuevoGrupoClienteFormaPago")) {
				jButtonNuevoGrupoClienteFormaPagoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarGrupoClienteFormaPago")) {
				jButtonDuplicarGrupoClienteFormaPagoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarGrupoClienteFormaPago")) {
				jButtonCopiarGrupoClienteFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormGrupoClienteFormaPago")) {
				jButtonVerFormGrupoClienteFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesGrupoClienteFormaPago")) {
				jButtonNuevoGrupoClienteFormaPagoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarGrupoClienteFormaPago")) {
				jButtonModificarGrupoClienteFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarGrupoClienteFormaPago")) {
				jButtonActualizarGrupoClienteFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarGrupoClienteFormaPago")) {
				jButtonEliminarGrupoClienteFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaGrupoClienteFormaPago")) {
				jButtonGuardarCambiosGrupoClienteFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarGrupoClienteFormaPago")) {
				jButtonCancelarGrupoClienteFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarGrupoClienteFormaPago")) {
				jButtonCerrarGrupoClienteFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosGrupoClienteFormaPago")) {
				jButtonGuardarCambiosGrupoClienteFormaPagoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosGrupoClienteFormaPago")) {
				jButtonNuevoGuardarCambiosGrupoClienteFormaPagoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByGrupoClienteFormaPago")) {
				jButtonAbrirOrderByGrupoClienteFormaPagoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionGrupoClienteFormaPago")) {
				jButtonRecargarInformacionGrupoClienteFormaPagoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresGrupoClienteFormaPago")) {
				jButtonAnterioresGrupoClienteFormaPagoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesGrupoClienteFormaPago")) {
				jButtonSiguientesGrupoClienteFormaPagoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idGrupoClienteFormaPagoBusqueda")) {
				this.jButtonidGrupoClienteFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaGrupoClienteFormaPagoUpdate")) {
				this.jButtonid_empresaGrupoClienteFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaGrupoClienteFormaPagoBusqueda")) {
				this.jButtonid_empresaGrupoClienteFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_grupo_clienteGrupoClienteFormaPagoUpdate")) {
				this.jButtonid_grupo_clienteGrupoClienteFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_grupo_clienteGrupoClienteFormaPagoBusqueda")) {
				this.jButtonid_grupo_clienteGrupoClienteFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_forma_pagoGrupoClienteFormaPagoUpdate")) {
				this.jButtonid_tipo_forma_pagoGrupoClienteFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_forma_pagoGrupoClienteFormaPagoBusqueda")) {
				this.jButtonid_tipo_forma_pagoGrupoClienteFormaPagoBusquedaActionPerformed(evt);
			}
			
			GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessGrupoClienteFormaPago();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameGrupoClienteFormaPago")) {
				closingInternalFrameGrupoClienteFormaPago();
				
			} else if(sTipo.equals("jButtonCancelarGrupoClienteFormaPago")) {
				JInternalFrameBase jInternalFrameDetalleFormGrupoClienteFormaPago = (JInternalFrameBase)evt.getSource();
	            	
	            GrupoClienteFormaPagoBeanSwingJInternalFrame jInternalFrameParent=(GrupoClienteFormaPagoBeanSwingJInternalFrame)jInternalFrameDetalleFormGrupoClienteFormaPago.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarGrupoClienteFormaPagoActionPerformed(null);
			}
			
			GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.grupoclienteformapago,new Object(),this.grupoclienteformapagoParameterGeneral,this.grupoclienteformapagoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormGrupoClienteFormaPago(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormGrupoClienteFormaPago(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormGrupoClienteFormaPago(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.grupoclienteformapago)) {
			if(!esControlTabla) {
				if(GrupoClienteFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualGrupoClienteFormaPago(this.grupoclienteformapago,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoClienteFormaPago(this.grupoclienteformapago);			
				}
				
				if(this.grupoclienteformapagoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualGrupoClienteFormaPago(this.grupoclienteformapago,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.grupoclienteformapagoReturnGeneral=grupoclienteformapagoLogic.procesarEventosGrupoClienteFormaPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos(),this.grupoclienteformapago,this.grupoclienteformapagoParameterGeneral,this.isEsNuevoGrupoClienteFormaPago,classes);//this.grupoclienteformapagoLogic.getGrupoClienteFormaPago()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanGrupoClienteFormaPago(this.grupoclienteformapagoReturnGeneral,this.grupoclienteformapagoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.grupoclienteformapagoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanGrupoClienteFormaPago(classes,this.grupoclienteformapagoReturnGeneral,this.grupoclienteformapagoBean,false);
					}
						
					if(this.grupoclienteformapagoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyGrupoClienteFormaPago(this.grupoclienteformapagoReturnGeneral.getGrupoClienteFormaPago());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioGrupoClienteFormaPago(this.grupoclienteformapagoReturnGeneral.getGrupoClienteFormaPago());	
					}
						
					if(this.grupoclienteformapagoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioGrupoClienteFormaPago(this.grupoclienteformapagoReturnGeneral.getGrupoClienteFormaPago(),classes);//this.grupoclienteformapagoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioGrupoClienteFormaPago(this.grupoclienteformapago,classes);//this.grupoclienteformapagoBean);									
				}
			
				if(GrupoClienteFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualGrupoClienteFormaPago(this.grupoclienteformapago,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoClienteFormaPago(this.grupoclienteformapago);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.grupoclienteformapagoAnterior!=null) {
						this.grupoclienteformapago=this.grupoclienteformapagoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.grupoclienteformapagoReturnGeneral=grupoclienteformapagoLogic.procesarEventosGrupoClienteFormaPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos(),this.grupoclienteformapago,this.grupoclienteformapagoParameterGeneral,this.isEsNuevoGrupoClienteFormaPago,classes);//this.grupoclienteformapagoLogic.getGrupoClienteFormaPago()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.grupoclienteformapagoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.grupoclienteformapagoReturnGeneral.getGrupoClienteFormaPago(),grupoclienteformapagoLogic.getGrupoClienteFormaPagos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.grupoclienteformapagoReturnGeneral.getGrupoClienteFormaPago(),this.grupoclienteformapagos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosGrupoClienteFormaPago.repaint();
				
				//((AbstractTableModel) this.jTableDatosGrupoClienteFormaPago.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosGrupoClienteFormaPago();
			}
		}
	}
	
	public void actualizarVisualTableDatosGrupoClienteFormaPago() throws Exception {
		
		GrupoClienteFormaPagoModel grupoclienteformapagoModel=(GrupoClienteFormaPagoModel)this.jTableDatosGrupoClienteFormaPago.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			grupoclienteformapagoModel.grupoclienteformapagos=this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			grupoclienteformapagoModel.grupoclienteformapagos=this.grupoclienteformapagos;
		}
		
		
		((GrupoClienteFormaPagoModel) this.jTableDatosGrupoClienteFormaPago.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaGrupoClienteFormaPago() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getgrupoclienteformapagoAnterior(),this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getgrupoclienteformapagoAnterior(),this.grupoclienteformapagos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosGrupoClienteFormaPago();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioGrupoClienteFormaPago(GrupoClienteFormaPago grupoclienteformapago,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
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
										
				GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.grupoclienteformapago,new Object(),generalEntityParameterGeneral,this.grupoclienteformapagoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.grupoclienteformapagoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=GrupoClienteFormaPagoConstantesFunciones.getClassesRelationshipsOfGrupoClienteFormaPago(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=GrupoClienteFormaPagoConstantesFunciones.getClassesRelationshipsFromStringsOfGrupoClienteFormaPago(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormGrupoClienteFormaPago(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.grupoclienteformapago,new Object(),generalEntityParameterGeneral,this.grupoclienteformapagoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioGrupoClienteFormaPago(GrupoClienteFormaPagoBean grupoclienteformapagoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanGrupoClienteFormaPago(ArrayList<Classe> classes,GrupoClienteFormaPagoReturnGeneral grupoclienteformapagoReturnGeneral,GrupoClienteFormaPagoBean grupoclienteformapagoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualGrupoClienteFormaPago(GrupoClienteFormaPago grupoclienteformapago,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.grupoclienteformapago)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormGrupoClienteFormaPago = new GrupoClienteFormaPagoDetalleFormJInternalFrame(jDesktopPane,this.grupoclienteformapagoSessionBean.getConGuardarRelaciones(),this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormGrupoClienteFormaPago);
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.setVisible(false);
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.setSelected(false);						
		
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.grupoclienteformapagoLogic=this.grupoclienteformapagoLogic;
		
		this.cargarCombosFrameForeignKeyGrupoClienteFormaPago("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleGrupoClienteFormaPago();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleGrupoClienteFormaPago();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyGrupoClienteFormaPago("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyGrupoClienteFormaPago();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarGrupoClienteFormaPago"));
		
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonModificarGrupoClienteFormaPago.addActionListener(new ButtonActionListener(this,"ModificarGrupoClienteFormaPago"));

		
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonModificarToolBarGrupoClienteFormaPago.addActionListener(new ButtonActionListener(this,"ModificarToolBarGrupoClienteFormaPago"));
					
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jMenuItemModificarGrupoClienteFormaPago.addActionListener(new ButtonActionListener(this,"MenuItemModificarGrupoClienteFormaPago"));		
		
		
		
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonActualizarGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"ActualizarGrupoClienteFormaPago"));
		
		
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonActualizarToolBarGrupoClienteFormaPago.addActionListener(new ButtonActionListener(this,"ActualizarToolBarGrupoClienteFormaPago"));
						
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jMenuItemActualizarGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemActualizarGrupoClienteFormaPago"));		
		
		
		
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonEliminarGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"EliminarGrupoClienteFormaPago"));
		
		
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonEliminarToolBarGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"EliminarToolBarGrupoClienteFormaPago"));
								
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jMenuItemEliminarGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemEliminarGrupoClienteFormaPago"));		
		
		
		
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonCancelarGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"CancelarGrupoClienteFormaPago"));
		
		
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonCancelarToolBarGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"CancelarToolBarGrupoClienteFormaPago"));
					
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jMenuItemCancelarGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemCancelarGrupoClienteFormaPago"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jMenuItemDetalleCerrarGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarGrupoClienteFormaPago"));		
		
		
		
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonGuardarCambiosToolBarGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarGrupoClienteFormaPago"));
		
		
		
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonGuardarCambiosToolBarGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarGrupoClienteFormaPago"));
		
		
		
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxTiposAccionesFormularioGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioGrupoClienteFormaPago"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonidGrupoClienteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"idGrupoClienteFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonid_empresaGrupoClienteFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaGrupoClienteFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonid_empresaGrupoClienteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaGrupoClienteFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonid_grupo_clienteGrupoClienteFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_clienteGrupoClienteFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonid_grupo_clienteGrupoClienteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_clienteGrupoClienteFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonid_tipo_forma_pagoGrupoClienteFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_forma_pagoGrupoClienteFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonid_tipo_forma_pagoGrupoClienteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_forma_pagoGrupoClienteFormaPagoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jTabbedPaneRelacionesGrupoClienteFormaPago.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesGrupoClienteFormaPago"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameGrupoClienteFormaPago"));
		
		if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarGrupoClienteFormaPago"));
		}
		
		this.jTableDatosGrupoClienteFormaPago.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarGrupoClienteFormaPago"));
		
		this.jTableDatosGrupoClienteFormaPago.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarGrupoClienteFormaPago"));
		
		this.jButtonNuevoGrupoClienteFormaPago.addActionListener(new ButtonActionListener(this,"NuevoGrupoClienteFormaPago"));
		
		this.jButtonDuplicarGrupoClienteFormaPago.addActionListener(new ButtonActionListener(this,"DuplicarGrupoClienteFormaPago"));
		
		this.jButtonCopiarGrupoClienteFormaPago.addActionListener(new ButtonActionListener(this,"CopiarGrupoClienteFormaPago"));
		
		this.jButtonVerFormGrupoClienteFormaPago.addActionListener(new ButtonActionListener(this,"VerFormGrupoClienteFormaPago"));
		
		
		this.jButtonNuevoToolBarGrupoClienteFormaPago.addActionListener(new ButtonActionListener(this,"NuevoToolBarGrupoClienteFormaPago"));
			
		this.jButtonDuplicarToolBarGrupoClienteFormaPago.addActionListener(new ButtonActionListener(this,"DuplicarToolBarGrupoClienteFormaPago"));
			
		this.jMenuItemNuevoGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGrupoClienteFormaPago"));
			
		this.jMenuItemDuplicarGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarGrupoClienteFormaPago"));		
		
		
		this.jButtonNuevoRelacionesGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"NuevoRelacionesGrupoClienteFormaPago"));
		
		
		this.jButtonNuevoRelacionesToolBarGrupoClienteFormaPago.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarGrupoClienteFormaPago"));
			
		this.jMenuItemNuevoRelacionesGrupoClienteFormaPago.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesGrupoClienteFormaPago"));		
		
		
		if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonModificarGrupoClienteFormaPago.addActionListener(new ButtonActionListener(this,"ModificarGrupoClienteFormaPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonModificarToolBarGrupoClienteFormaPago.addActionListener(new ButtonActionListener(this,"ModificarToolBarGrupoClienteFormaPago"));
			
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.jMenuItemModificarGrupoClienteFormaPago.addActionListener(new ButtonActionListener(this,"MenuItemModificarGrupoClienteFormaPago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonActualizarGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"ActualizarGrupoClienteFormaPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonActualizarToolBarGrupoClienteFormaPago.addActionListener(new ButtonActionListener(this,"ActualizarToolBarGrupoClienteFormaPago"));
				
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.jMenuItemActualizarGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemActualizarGrupoClienteFormaPago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonEliminarGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"EliminarGrupoClienteFormaPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonEliminarToolBarGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"EliminarToolBarGrupoClienteFormaPago"));
						
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.jMenuItemEliminarGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemEliminarGrupoClienteFormaPago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonCancelarGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"CancelarGrupoClienteFormaPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonCancelarToolBarGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"CancelarToolBarGrupoClienteFormaPago"));
			
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.jMenuItemCancelarGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemCancelarGrupoClienteFormaPago"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarGrupoClienteFormaPago"));		
		
		
		this.jButtonCerrarGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"CerrarGrupoClienteFormaPago"));
		
		
		this.jButtonCerrarToolBarGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"CerrarToolBarGrupoClienteFormaPago"));
			
		this.jMenuItemCerrarGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemCerrarGrupoClienteFormaPago"));
			
		if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.jMenuItemDetalleCerrarGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarGrupoClienteFormaPago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonGuardarCambiosGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosGrupoClienteFormaPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonGuardarCambiosToolBarGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarGrupoClienteFormaPago"));
		}
		
		this.jButtonCopiarToolBarGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"CopiarToolBarGrupoClienteFormaPago"));
			
		this.jButtonVerFormToolBarGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"VerFormToolBarGrupoClienteFormaPago"));
		
		this.jMenuItemGuardarCambiosGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosGrupoClienteFormaPago"));
			
		this.jMenuItemCopiarGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemCopiarGrupoClienteFormaPago"));		
		
		this.jMenuItemVerFormGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemVerFormGrupoClienteFormaPago"));		
		
		
		this.jButtonGuardarCambiosTablaGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaGrupoClienteFormaPago"));
		
		
		this.jButtonGuardarCambiosTablaToolBarGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarGrupoClienteFormaPago"));
			
		this.jMenuItemGuardarCambiosTablaGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaGrupoClienteFormaPago"));		
		
		
		
		this.jButtonRecargarInformacionGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"RecargarInformacionGrupoClienteFormaPago"));
					
		this.jButtonRecargarInformacionToolBarGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarGrupoClienteFormaPago"));
		
		this.jMenuItemRecargarInformacionGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionGrupoClienteFormaPago"));		
		
		
		
		this.jButtonAnterioresGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"AnterioresGrupoClienteFormaPago"));
		
		
		this.jButtonAnterioresToolBarGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"AnterioresToolBarGrupoClienteFormaPago"));
		
		this.jMenuItemAnterioresGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresGrupoClienteFormaPago"));		
		
		
		this.jButtonSiguientesGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"SiguientesGrupoClienteFormaPago"));
		
		
		this.jButtonSiguientesToolBarGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"SiguientesToolBarGrupoClienteFormaPago"));
			
		this.jMenuItemSiguientesGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesGrupoClienteFormaPago"));
			
		this.jMenuItemAbrirOrderByGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByGrupoClienteFormaPago"));
			
		this.jMenuItemMostrarOcultarGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarGrupoClienteFormaPago"));
			
		this.jMenuItemDetalleAbrirOrderByGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByGrupoClienteFormaPago"));
			
		this.jMenuItemDetalleMostarOcultarGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarGrupoClienteFormaPago"));		
		
		
		this.jButtonNuevoGuardarCambiosGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosGrupoClienteFormaPago"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarGrupoClienteFormaPago"));
			
		this.jMenuItemNuevoGuardarCambiosGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosGrupoClienteFormaPago"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosGrupoClienteFormaPago.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosGrupoClienteFormaPago"));

		this.jCheckBoxSeleccionadosGrupoClienteFormaPago.addItemListener(new CheckBoxItemListener(this,"SeleccionadosGrupoClienteFormaPago"));
		
		if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxTiposAccionesFormularioGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioGrupoClienteFormaPago"));
		}
		
		
		this.jComboBoxTiposRelacionesGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"TiposRelacionesGrupoClienteFormaPago"));
			
		this.jComboBoxTiposAccionesGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"TiposAccionesGrupoClienteFormaPago"));
					
		this.jComboBoxTiposSeleccionarGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"TiposSeleccionarGrupoClienteFormaPago"));
			
		this.jTextFieldValorCampoGeneralGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralGrupoClienteFormaPago"));		
		
		
		if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonidGrupoClienteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"idGrupoClienteFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonid_empresaGrupoClienteFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaGrupoClienteFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonid_empresaGrupoClienteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaGrupoClienteFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonid_grupo_clienteGrupoClienteFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_clienteGrupoClienteFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonid_grupo_clienteGrupoClienteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_clienteGrupoClienteFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonid_tipo_forma_pagoGrupoClienteFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_forma_pagoGrupoClienteFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonid_tipo_forma_pagoGrupoClienteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_forma_pagoGrupoClienteFormaPagoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdGrupoClienteGrupoClienteFormaPago.addActionListener(new ButtonActionListener(this,"FK_IdGrupoClienteGrupoClienteFormaPago"));

			this.jButtonFK_IdTipoFormaPagoGrupoClienteFormaPago.addActionListener(new ButtonActionListener(this,"FK_IdTipoFormaPagoGrupoClienteFormaPago"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoGrupoClienteFormaPago!=null) {
				this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoGrupoClienteFormaPago"));
				this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoGrupoClienteFormaPago"));
				this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoGrupoClienteFormaPago"));
			}
			
			//this.jButtonCerrarReporteDinamicoGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoGrupoClienteFormaPago"));				
			//this.jButtonGenerarReporteDinamicoGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoGrupoClienteFormaPago"));
			//this.jButtonGenerarExcelReporteDinamicoGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoGrupoClienteFormaPago"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionGrupoClienteFormaPago!=null) {
				this.jInternalFrameImportacionGrupoClienteFormaPago.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionGrupoClienteFormaPago"));
				this.jInternalFrameImportacionGrupoClienteFormaPago.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionGrupoClienteFormaPago"));
				this.jInternalFrameImportacionGrupoClienteFormaPago.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionGrupoClienteFormaPago"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"AbrirOrderByGrupoClienteFormaPago"));
			
			this.jButtonAbrirOrderByToolBarGrupoClienteFormaPago.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarGrupoClienteFormaPago"));			
			
			if(this.jInternalFrameOrderByGrupoClienteFormaPago!=null) {
				this.jInternalFrameOrderByGrupoClienteFormaPago.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByGrupoClienteFormaPago"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoClienteFormaPago.jTabbedPaneRelacionesGrupoClienteFormaPago.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesGrupoClienteFormaPago"));
		
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
            		closingInternalFrameGrupoClienteFormaPago();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormGrupoClienteFormaPago = (JInternalFrameBase)event.getSource();
	            	
	            GrupoClienteFormaPagoBeanSwingJInternalFrame jInternalFrameParent=(GrupoClienteFormaPagoBeanSwingJInternalFrame)jInternalFrameDetalleFormGrupoClienteFormaPago.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarGrupoClienteFormaPagoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosGrupoClienteFormaPago.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosGrupoClienteFormaPagoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosGrupoClienteFormaPago.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosGrupoClienteFormaPago.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGrupoClienteFormaPagoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGrupoClienteFormaPagoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGrupoClienteFormaPagoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoGrupoClienteFormaPago";
		inputMap = this.jButtonNuevoGrupoClienteFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoGrupoClienteFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoGrupoClienteFormaPagoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGrupoClienteFormaPagoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGrupoClienteFormaPagoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGrupoClienteFormaPagoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesGrupoClienteFormaPago";
		inputMap = this.jButtonNuevoRelacionesGrupoClienteFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesGrupoClienteFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoGrupoClienteFormaPagoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarGrupoClienteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarGrupoClienteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarGrupoClienteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarGrupoClienteFormaPago";
		inputMap = this.jButtonModificarGrupoClienteFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarGrupoClienteFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarGrupoClienteFormaPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarGrupoClienteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarGrupoClienteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarGrupoClienteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarGrupoClienteFormaPago";
		inputMap = this.jButtonActualizarGrupoClienteFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarGrupoClienteFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarGrupoClienteFormaPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarGrupoClienteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarGrupoClienteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarGrupoClienteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarGrupoClienteFormaPago";
		inputMap = this.jButtonEliminarGrupoClienteFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarGrupoClienteFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarGrupoClienteFormaPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarGrupoClienteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarGrupoClienteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarGrupoClienteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarGrupoClienteFormaPago";
		inputMap = this.jButtonCancelarGrupoClienteFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarGrupoClienteFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarGrupoClienteFormaPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarGrupoClienteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarGrupoClienteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarGrupoClienteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarGrupoClienteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarGrupoClienteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarGrupoClienteFormaPago";
		inputMap = this.jButtonCerrarGrupoClienteFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarGrupoClienteFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarGrupoClienteFormaPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonGuardarCambiosGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGrupoClienteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGrupoClienteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGrupoClienteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGrupoClienteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGrupoClienteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGrupoClienteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosGrupoClienteFormaPago";
		inputMap = this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonGuardarCambiosGrupoClienteFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonGuardarCambiosGrupoClienteFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosGrupoClienteFormaPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionGrupoClienteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionGrupoClienteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionGrupoClienteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresGrupoClienteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresGrupoClienteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresGrupoClienteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesGrupoClienteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesGrupoClienteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesGrupoClienteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosGrupoClienteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosGrupoClienteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosGrupoClienteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosGrupoClienteFormaPago.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosGrupoClienteFormaPagoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesGrupoClienteFormaPago.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesGrupoClienteFormaPagoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarGrupoClienteFormaPago.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarGrupoClienteFormaPagoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralGrupoClienteFormaPago.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralGrupoClienteFormaPagoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonidGrupoClienteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"idGrupoClienteFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonid_empresaGrupoClienteFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaGrupoClienteFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonid_empresaGrupoClienteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaGrupoClienteFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonid_grupo_clienteGrupoClienteFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_clienteGrupoClienteFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonid_grupo_clienteGrupoClienteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_clienteGrupoClienteFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonid_tipo_forma_pagoGrupoClienteFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_forma_pagoGrupoClienteFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jButtonid_tipo_forma_pagoGrupoClienteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_forma_pagoGrupoClienteFormaPagoBusqueda"));
		
		
		this.jButtonFK_IdGrupoClienteGrupoClienteFormaPago.addActionListener(new ButtonActionListener(this,"FK_IdGrupoClienteGrupoClienteFormaPago"));

		this.jButtonFK_IdTipoFormaPagoGrupoClienteFormaPago.addActionListener(new ButtonActionListener(this,"FK_IdTipoFormaPagoGrupoClienteFormaPago"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoGrupoClienteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoGrupoClienteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoGrupoClienteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionGrupoClienteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionGrupoClienteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionGrupoClienteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionGrupoClienteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarGrupoClienteFormaPagoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarGrupoClienteFormaPago.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosGrupoClienteFormaPago(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(GrupoClienteFormaPago grupoclienteformapagoAux:this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos()) {
					grupoclienteformapagoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GrupoClienteFormaPago grupoclienteformapagoAux:grupoclienteformapagos) {
					grupoclienteformapagoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosGrupoClienteFormaPagoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingGrupoClienteFormaPago(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(GrupoClienteFormaPago grupoclienteformapagoAux:this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos()) {
						grupoclienteformapagoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(GrupoClienteFormaPago grupoclienteformapagoAux:grupoclienteformapagos) {
						grupoclienteformapagoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(GrupoClienteFormaPago grupoclienteformapagoAux:this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(GrupoClienteFormaPago grupoclienteformapagoAux:grupoclienteformapagos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaGrupoClienteFormaPago(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosGrupoClienteFormaPago.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosGrupoClienteFormaPago.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosGrupoClienteFormaPago,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosGrupoClienteFormaPagoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingGrupoClienteFormaPago(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosGrupoClienteFormaPago.getSelectedRows();
			
			GrupoClienteFormaPago grupoclienteformapagoLocal=new GrupoClienteFormaPago();
			
			//this.seleccionarTodosGrupoClienteFormaPago(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupoclienteformapagoLocal =(GrupoClienteFormaPago) this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos().toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					grupoclienteformapagoLocal =(GrupoClienteFormaPago) this.grupoclienteformapagos.toArray()[this.jTableDatosGrupoClienteFormaPago.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				grupoclienteformapagoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(GrupoClienteFormaPago grupoclienteformapagoAux:this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos()) {
						grupoclienteformapagoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(GrupoClienteFormaPago grupoclienteformapagoAux:grupoclienteformapagos) {
						grupoclienteformapagoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaGrupoClienteFormaPago(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosGrupoClienteFormaPago.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosGrupoClienteFormaPago.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosGrupoClienteFormaPago,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualGrupoClienteFormaPagoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarGrupoClienteFormaPagoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralGrupoClienteFormaPagoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingGrupoClienteFormaPago(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralGrupoClienteFormaPago.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(GrupoClienteFormaPago grupoclienteformapagoAux:this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GrupoClienteFormaPago grupoclienteformapagoAux:grupoclienteformapagos) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaGrupoClienteFormaPago(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesGrupoClienteFormaPagoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingGrupoClienteFormaPago(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioGrupoClienteFormaPago=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesGrupoClienteFormaPago.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxTiposAccionesFormularioGrupoClienteFormaPago.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteGrupoClienteFormaPago) {				
					conSplash=true;//false;										
					
					//this.startProcessGrupoClienteFormaPago(conSplash);
				
					this.generarReporteGrupoClienteFormaPagosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGrupoClienteFormaPago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxTiposAccionesFormularioGrupoClienteFormaPago.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoGrupoClienteFormaPagosSeleccionados();
				//this.jComboBoxTiposAccionesGrupoClienteFormaPago.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoGrupoClienteFormaPagosSeleccionados(false);
				//this.jComboBoxTiposAccionesGrupoClienteFormaPago.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoGrupoClienteFormaPagosSeleccionados(true);
				//this.jComboBoxTiposAccionesGrupoClienteFormaPago.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessGrupoClienteFormaPago();
				
				this.exportarGrupoClienteFormaPagosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGrupoClienteFormaPago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxTiposAccionesFormularioGrupoClienteFormaPago.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionGrupoClienteFormaPagos();
				//this.importarGrupoClienteFormaPagos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGrupoClienteFormaPago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxTiposAccionesFormularioGrupoClienteFormaPago.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessGrupoClienteFormaPago();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelGrupoClienteFormaPagosSeleccionados();
				//this.jComboBoxTiposAccionesGrupoClienteFormaPago.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Grupo Cliente Forma Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessGrupoClienteFormaPago();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoGrupoClienteFormaPago)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyGrupoClienteFormaPago(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Grupo Cliente Forma Pago",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGrupoClienteFormaPago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxTiposAccionesFormularioGrupoClienteFormaPago.setSelectedIndex(0);					
				}	
			} 			
			else if(GrupoClienteFormaPagoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteGrupoClienteFormaPago) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessGrupoClienteFormaPago(conSplash);
					
						//this.actualizarParametrosGeneralGrupoClienteFormaPago();
						
						this.generarReporteProcesoAccionGrupoClienteFormaPagosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesGrupoClienteFormaPago.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxTiposAccionesFormularioGrupoClienteFormaPago.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Grupo Cliente Forma PagoS SELECCIONADOS?", "MANTENIMIENTO DE Grupo Cliente Forma Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessGrupoClienteFormaPago();
				
						this.actualizarParametrosGeneralGrupoClienteFormaPago();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.grupoclienteformapagoReturnGeneral=grupoclienteformapagoLogic.procesarAccionGrupoClienteFormaPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos(),this.grupoclienteformapagoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarGrupoClienteFormaPagoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesGrupoClienteFormaPago.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxTiposAccionesFormularioGrupoClienteFormaPago.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralGrupoClienteFormaPago();
					
					GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarGrupoClienteFormaPagoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesGrupoClienteFormaPago.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxTiposAccionesFormularioGrupoClienteFormaPago.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessGrupoClienteFormaPago(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesGrupoClienteFormaPagoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessGrupoClienteFormaPago();
			
			if(this.jInternalFrameDetalleFormGrupoClienteFormaPago==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<GrupoClienteFormaPago> grupoclienteformapagosSeleccionados=new ArrayList<GrupoClienteFormaPago>();		
			GrupoClienteFormaPago grupoclienteformapago=new GrupoClienteFormaPago();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingGrupoClienteFormaPago(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesGrupoClienteFormaPago.getSelectedItem();
			
			
			
			
			grupoclienteformapagosSeleccionados=this.getGrupoClienteFormaPagosSeleccionados(true);
			//this.sTipoAccion;
			
			if(grupoclienteformapagosSeleccionados.size()==1) {
				for(GrupoClienteFormaPago grupoclienteformapagoAux:grupoclienteformapagosSeleccionados) {
					grupoclienteformapago=grupoclienteformapagoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessGrupoClienteFormaPago();
			
      		//this.finishProcessGrupoClienteFormaPago(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarGrupoClienteFormaPagoReturnGeneral() throws Exception {
		if(this.grupoclienteformapagoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.grupoclienteformapagoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.grupoclienteformapagoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.grupoclienteformapagoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.grupoclienteformapagoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.grupoclienteformapagoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingGrupoClienteFormaPago(false);
		}
		
		if(this.grupoclienteformapagoReturnGeneral.getConRetornoLista() || this.grupoclienteformapagoReturnGeneral.getConRetornoObjeto()) {
			if(this.grupoclienteformapagoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.grupoclienteformapagoLogic.setGrupoClienteFormaPagos(this.grupoclienteformapagoReturnGeneral.getGrupoClienteFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.grupoclienteformapagoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.grupoclienteformapagoLogic.setGrupoClienteFormaPago(this.grupoclienteformapagoReturnGeneral.getGrupoClienteFormaPago());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingGrupoClienteFormaPago(false);
		}
	}
	
	public void actualizarParametrosGeneralGrupoClienteFormaPago() throws Exception {
		
		
	}
	
	public ArrayList<GrupoClienteFormaPago> getGrupoClienteFormaPagosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<GrupoClienteFormaPago> grupoclienteformapagosSeleccionados=new ArrayList<GrupoClienteFormaPago>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioGrupoClienteFormaPago) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(GrupoClienteFormaPago grupoclienteformapagoAux:grupoclienteformapagoLogic.getGrupoClienteFormaPagos()) {
					if(grupoclienteformapagoAux.getIsSelected()) {
						grupoclienteformapagosSeleccionados.add(grupoclienteformapagoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GrupoClienteFormaPago grupoclienteformapagoAux:this.grupoclienteformapagos) {
					if(grupoclienteformapagoAux.getIsSelected()) {
						grupoclienteformapagosSeleccionados.add(grupoclienteformapagoAux);				
					}
				}
			}
			
			if(grupoclienteformapagosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						grupoclienteformapagosSeleccionados.addAll(this.grupoclienteformapagoLogic.getGrupoClienteFormaPagos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						grupoclienteformapagosSeleccionados.addAll(this.grupoclienteformapagos);				
					}
				}
			}
		} else {
			grupoclienteformapagosSeleccionados.add(this.grupoclienteformapago);
		}
		
		return grupoclienteformapagosSeleccionados;
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
	
	public void generarReporteGrupoClienteFormaPagosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalGrupoClienteFormaPagosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoGrupoClienteFormaPagosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoGrupoClienteFormaPagosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoGrupoClienteFormaPagosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Grupo Cliente Forma Pago",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesGrupoClienteFormaPagosSeleccionados() throws Exception {
		ArrayList<GrupoClienteFormaPago> grupoclienteformapagosSeleccionados=new ArrayList<GrupoClienteFormaPago>();		
		
		grupoclienteformapagosSeleccionados=this.getGrupoClienteFormaPagosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteGrupoClienteFormaPagos("Todos",grupoclienteformapagosSeleccionados);
		
	}	
	
	public void generarReporteNormalGrupoClienteFormaPagosSeleccionados() throws Exception {
		ArrayList<GrupoClienteFormaPago> grupoclienteformapagosSeleccionados=new ArrayList<GrupoClienteFormaPago>();		
		
		grupoclienteformapagosSeleccionados=this.getGrupoClienteFormaPagosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteGrupoClienteFormaPagos("Todos",grupoclienteformapagosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionGrupoClienteFormaPagosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<GrupoClienteFormaPago> grupoclienteformapagosSeleccionados=new ArrayList<GrupoClienteFormaPago>();
		
		grupoclienteformapagosSeleccionados=this.getGrupoClienteFormaPagosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteGrupoClienteFormaPagos("Todos",grupoclienteformapagosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoGrupoClienteFormaPagosSeleccionados() throws Exception {
		ArrayList<GrupoClienteFormaPago> grupoclienteformapagosSeleccionados=new ArrayList<GrupoClienteFormaPago>();		
		
		
		this.abrirInicializarFrameReporteDinamicoGrupoClienteFormaPago();
		
		
		grupoclienteformapagosSeleccionados=this.getGrupoClienteFormaPagosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoGrupoClienteFormaPago();
		
		
		//this.generarReporteGrupoClienteFormaPagos("Todos",grupoclienteformapagosSeleccionados ,grupoclienteformapagoImplementable,grupoclienteformapagoImplementableHome);
	}
	
	public void mostrarImportacionGrupoClienteFormaPagos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionGrupoClienteFormaPago();
		
		this.abrirFrameImportacionGrupoClienteFormaPago();		
		
			
		//this.generarReporteGrupoClienteFormaPagos("Todos",grupoclienteformapagosSeleccionados ,grupoclienteformapagoImplementable,grupoclienteformapagoImplementableHome);
	}
	
	public void importarGrupoClienteFormaPagos() throws Exception {		
	
	}
	
	public void exportarGrupoClienteFormaPagosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelGrupoClienteFormaPagosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoGrupoClienteFormaPagosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlGrupoClienteFormaPagosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Grupo Cliente Forma Pago",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoGrupoClienteFormaPagosSeleccionados() throws Exception {
		ArrayList<GrupoClienteFormaPago> grupoclienteformapagosSeleccionados=new ArrayList<GrupoClienteFormaPago>();		
		
		grupoclienteformapagosSeleccionados=this.getGrupoClienteFormaPagosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"grupoclienteformapago."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarGrupoClienteFormaPago(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(GrupoClienteFormaPago grupoclienteformapagoAux:grupoclienteformapagosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarGrupoClienteFormaPago(grupoclienteformapagoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//grupoclienteformapagoAux.setsDetalleGeneralEntityReporte(grupoclienteformapagoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Grupo Cliente Forma Pago",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarGrupoClienteFormaPago(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=GrupoClienteFormaPagoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GrupoClienteFormaPagoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GrupoClienteFormaPagoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GrupoClienteFormaPagoConstantesFunciones.LABEL_IDGRUPOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GrupoClienteFormaPagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarGrupoClienteFormaPago(GrupoClienteFormaPago grupoclienteformapago,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=grupoclienteformapago.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=grupoclienteformapago.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=grupoclienteformapago.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=grupoclienteformapago.getgrupocliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=grupoclienteformapago.gettipoformapago_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelGrupoClienteFormaPagosSeleccionados() throws Exception {
		ArrayList<GrupoClienteFormaPago> grupoclienteformapagosSeleccionados=new ArrayList<GrupoClienteFormaPago>();		
		
		grupoclienteformapagosSeleccionados=this.getGrupoClienteFormaPagosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"grupoclienteformapago.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("GrupoClienteFormaPagos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelGrupoClienteFormaPago(row);				
				iRow++;
			}				
			
			for(GrupoClienteFormaPago grupoclienteformapagoAux:grupoclienteformapagosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelGrupoClienteFormaPago(grupoclienteformapagoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Grupo Cliente Forma Pago",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlGrupoClienteFormaPagosSeleccionados() throws Exception {
		ArrayList<GrupoClienteFormaPago> grupoclienteformapagosSeleccionados=new ArrayList<GrupoClienteFormaPago>();		
		
		grupoclienteformapagosSeleccionados=this.getGrupoClienteFormaPagosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"grupoclienteformapago.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("grupoclienteformapagos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("grupoclienteformapago");
			//elementRoot.appendChild(element);
		
			for(GrupoClienteFormaPago grupoclienteformapagoAux:grupoclienteformapagosSeleccionados) {
				element = document.createElement("grupoclienteformapago");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlGrupoClienteFormaPago(grupoclienteformapagoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Grupo Cliente Forma Pago",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelGrupoClienteFormaPago(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(GrupoClienteFormaPagoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(GrupoClienteFormaPagoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(GrupoClienteFormaPagoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(GrupoClienteFormaPagoConstantesFunciones.LABEL_IDGRUPOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(GrupoClienteFormaPagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelGrupoClienteFormaPago(GrupoClienteFormaPago grupoclienteformapago,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(grupoclienteformapago.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(grupoclienteformapago.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(grupoclienteformapago.getgrupocliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(grupoclienteformapago.gettipoformapago_descripcion());				
	}
	
	public void setFilaDatosExportarXmlGrupoClienteFormaPago(GrupoClienteFormaPago grupoclienteformapago,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(GrupoClienteFormaPagoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(grupoclienteformapago.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(GrupoClienteFormaPagoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(grupoclienteformapago.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(GrupoClienteFormaPagoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(grupoclienteformapago.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementgrupocliente_descripcion = document.createElement(GrupoClienteFormaPagoConstantesFunciones.IDGRUPOCLIENTE);
		elementgrupocliente_descripcion.appendChild(document.createTextNode(grupoclienteformapago.getgrupocliente_descripcion()));
		element.appendChild(elementgrupocliente_descripcion);

		Element elementtipoformapago_descripcion = document.createElement(GrupoClienteFormaPagoConstantesFunciones.IDTIPOFORMAPAGO);
		elementtipoformapago_descripcion.appendChild(document.createTextNode(grupoclienteformapago.gettipoformapago_descripcion()));
		element.appendChild(elementtipoformapago_descripcion);
	}
	
	public void generarReporteGroupGenericoGrupoClienteFormaPagosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<GrupoClienteFormaPago> grupoclienteformapagosSeleccionados=new ArrayList<GrupoClienteFormaPago>();
		
		grupoclienteformapagosSeleccionados=this.getGrupoClienteFormaPagosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoGrupoClienteFormaPago(grupoclienteformapagosSeleccionados);
		
		this.generarReporteGrupoClienteFormaPagos("Todos",grupoclienteformapagosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoGrupoClienteFormaPago(ArrayList<GrupoClienteFormaPago> grupoclienteformapagosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(GrupoClienteFormaPago grupoclienteformapagoAux:grupoclienteformapagosSeleccionados) {
				grupoclienteformapagoAux.setsDetalleGeneralEntityReporte(grupoclienteformapagoAux.toString());
			
				if(sTipoSeleccionar.equals(GrupoClienteFormaPagoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					grupoclienteformapagoAux.setsDescripcionGeneralEntityReporte1(grupoclienteformapagoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(GrupoClienteFormaPagoConstantesFunciones.LABEL_IDGRUPOCLIENTE)) {
					existe=true;
					grupoclienteformapagoAux.setsDescripcionGeneralEntityReporte1(grupoclienteformapagoAux.getgrupocliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(GrupoClienteFormaPagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO)) {
					existe=true;
					grupoclienteformapagoAux.setsDescripcionGeneralEntityReporte1(grupoclienteformapagoAux.gettipoformapago_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoClienteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesGrupoClienteFormaPago(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoGrupoClienteFormaPago=true;
				this.isVisibilidadCeldaNuevoRelacionesGrupoClienteFormaPago=true;
				this.isVisibilidadCeldaGuardarCambiosGrupoClienteFormaPago=true;
			}
			
			this.isVisibilidadCeldaModificarGrupoClienteFormaPago=false;
			this.isVisibilidadCeldaActualizarGrupoClienteFormaPago=false;
			this.isVisibilidadCeldaEliminarGrupoClienteFormaPago=false;
			this.isVisibilidadCeldaCancelarGrupoClienteFormaPago=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGrupoClienteFormaPago=true;
				} else {
					this.isVisibilidadCeldaGuardarGrupoClienteFormaPago=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoGrupoClienteFormaPago=false;
			this.isVisibilidadCeldaNuevoRelacionesGrupoClienteFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosGrupoClienteFormaPago=false;
			this.isVisibilidadCeldaModificarGrupoClienteFormaPago=false;
			this.isVisibilidadCeldaActualizarGrupoClienteFormaPago=true;
			this.isVisibilidadCeldaEliminarGrupoClienteFormaPago=false;
			this.isVisibilidadCeldaCancelarGrupoClienteFormaPago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGrupoClienteFormaPago=true;
				} else {
					this.isVisibilidadCeldaGuardarGrupoClienteFormaPago=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoGrupoClienteFormaPago=false;
			this.isVisibilidadCeldaNuevoRelacionesGrupoClienteFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosGrupoClienteFormaPago=false;
			this.isVisibilidadCeldaModificarGrupoClienteFormaPago=false;
			this.isVisibilidadCeldaActualizarGrupoClienteFormaPago=true;
			this.isVisibilidadCeldaEliminarGrupoClienteFormaPago=true;
			this.isVisibilidadCeldaCancelarGrupoClienteFormaPago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGrupoClienteFormaPago=true;
				} else {
					this.isVisibilidadCeldaGuardarGrupoClienteFormaPago=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoGrupoClienteFormaPago=false;
			this.isVisibilidadCeldaNuevoRelacionesGrupoClienteFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosGrupoClienteFormaPago=false;
			this.isVisibilidadCeldaModificarGrupoClienteFormaPago=false;
			this.isVisibilidadCeldaActualizarGrupoClienteFormaPago=true;
			this.isVisibilidadCeldaEliminarGrupoClienteFormaPago=false;
			this.isVisibilidadCeldaCancelarGrupoClienteFormaPago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGrupoClienteFormaPago=false;
				} else {
					this.isVisibilidadCeldaGuardarGrupoClienteFormaPago=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoGrupoClienteFormaPago=true;
			this.isVisibilidadCeldaNuevoRelacionesGrupoClienteFormaPago=true;
			this.isVisibilidadCeldaGuardarCambiosGrupoClienteFormaPago=true;
			this.isVisibilidadCeldaModificarGrupoClienteFormaPago=false;
			this.isVisibilidadCeldaActualizarGrupoClienteFormaPago=false;
			this.isVisibilidadCeldaEliminarGrupoClienteFormaPago=false;
			this.isVisibilidadCeldaCancelarGrupoClienteFormaPago=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGrupoClienteFormaPago=true;
				} else {
					this.isVisibilidadCeldaGuardarGrupoClienteFormaPago=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoGrupoClienteFormaPago=false;
			this.isVisibilidadCeldaNuevoRelacionesGrupoClienteFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosGrupoClienteFormaPago=false;
			this.isVisibilidadCeldaActualizarGrupoClienteFormaPago=false;
			this.isVisibilidadCeldaEliminarGrupoClienteFormaPago=false;
			this.isVisibilidadCeldaCancelarGrupoClienteFormaPago=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGrupoClienteFormaPago=false;
				} else {
					this.isVisibilidadCeldaGuardarGrupoClienteFormaPago=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoGrupoClienteFormaPago=false;
			this.isVisibilidadCeldaNuevoRelacionesGrupoClienteFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosGrupoClienteFormaPago=false;
			this.isVisibilidadCeldaModificarGrupoClienteFormaPago=true;
			this.isVisibilidadCeldaActualizarGrupoClienteFormaPago=false;
			this.isVisibilidadCeldaEliminarGrupoClienteFormaPago=false;
			this.isVisibilidadCeldaCancelarGrupoClienteFormaPago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGrupoClienteFormaPago=false;
				} else {
					this.isVisibilidadCeldaGuardarGrupoClienteFormaPago=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(GrupoClienteFormaPagoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoGrupoClienteFormaPago=true;
			this.isVisibilidadCeldaNuevoRelacionesGrupoClienteFormaPago=true;
			this.isVisibilidadCeldaGuardarCambiosGrupoClienteFormaPago=true;
		} else {
			this.actualizarEstadoPanelsGrupoClienteFormaPago(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarGrupoClienteFormaPago=false;
			//this.isVisibilidadCeldaVerFormGrupoClienteFormaPago=false;
			this.isVisibilidadCeldaDuplicarGrupoClienteFormaPago=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!grupoclienteformapagoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesGrupoClienteFormaPago=false;
		} else {
			this.isVisibilidadCeldaNuevoGrupoClienteFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosGrupoClienteFormaPago=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {
			if(!grupoclienteformapagoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesGrupoClienteFormaPago=false;												
			}
			
			this.jButtonCerrarGrupoClienteFormaPago.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesGrupoClienteFormaPago=false;
		}
		
		if(!this.permiteMantenimiento(this.grupoclienteformapago)) {
			this.isVisibilidadCeldaActualizarGrupoClienteFormaPago=false;
			this.isVisibilidadCeldaEliminarGrupoClienteFormaPago=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesGrupoClienteFormaPago() {
	}
	
	public void actualizarEstadoPanelsGrupoClienteFormaPago(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionGrupoClienteFormaPago!=null) {
				this.jScrollPanelDatosEdicionGrupoClienteFormaPago.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGrupoClienteFormaPago!=null) {
				this.jTabbedPaneBusquedasGrupoClienteFormaPago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGrupoClienteFormaPago!=null) {
				this.jScrollPanelDatosGrupoClienteFormaPago.setVisible(true);
			}
			
			if(this.jPanelPaginacionGrupoClienteFormaPago!=null) {
				this.jPanelPaginacionGrupoClienteFormaPago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGrupoClienteFormaPago!=null) {
				this.jPanelParametrosReportesGrupoClienteFormaPago.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionGrupoClienteFormaPago!=null) {
				this.jScrollPanelDatosEdicionGrupoClienteFormaPago.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGrupoClienteFormaPago!=null) {
				this.jTabbedPaneBusquedasGrupoClienteFormaPago.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosGrupoClienteFormaPago!=null) {
				this.jScrollPanelDatosGrupoClienteFormaPago.setVisible(false);
			}
			
			if(this.jPanelPaginacionGrupoClienteFormaPago!=null) {
				this.jPanelPaginacionGrupoClienteFormaPago.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesGrupoClienteFormaPago!=null) {
				this.jPanelParametrosReportesGrupoClienteFormaPago.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionGrupoClienteFormaPago!=null) {
				this.jScrollPanelDatosEdicionGrupoClienteFormaPago.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGrupoClienteFormaPago!=null) {
				this.jTabbedPaneBusquedasGrupoClienteFormaPago.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosGrupoClienteFormaPago!=null) {
				this.jScrollPanelDatosGrupoClienteFormaPago.setVisible(false);
			}
			
			if(this.jPanelPaginacionGrupoClienteFormaPago!=null) {
				this.jPanelPaginacionGrupoClienteFormaPago.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesGrupoClienteFormaPago!=null) {
				this.jPanelParametrosReportesGrupoClienteFormaPago.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionGrupoClienteFormaPago!=null) {
				this.jScrollPanelDatosEdicionGrupoClienteFormaPago.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGrupoClienteFormaPago!=null) {
				this.jTabbedPaneBusquedasGrupoClienteFormaPago.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosGrupoClienteFormaPago!=null) {
				this.jScrollPanelDatosGrupoClienteFormaPago.setVisible(false);
			}
			
			if(this.jPanelPaginacionGrupoClienteFormaPago!=null) {
				this.jPanelPaginacionGrupoClienteFormaPago.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesGrupoClienteFormaPago!=null) {
				this.jPanelParametrosReportesGrupoClienteFormaPago.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionGrupoClienteFormaPago!=null) {
				this.jScrollPanelDatosEdicionGrupoClienteFormaPago.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGrupoClienteFormaPago!=null) {
				this.jTabbedPaneBusquedasGrupoClienteFormaPago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGrupoClienteFormaPago!=null) {
				this.jScrollPanelDatosGrupoClienteFormaPago.setVisible(true);
			}
			
			if(this.jPanelPaginacionGrupoClienteFormaPago!=null) {
				this.jPanelPaginacionGrupoClienteFormaPago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGrupoClienteFormaPago!=null) {
				this.jPanelParametrosReportesGrupoClienteFormaPago.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionGrupoClienteFormaPago!=null) {
				this.jScrollPanelDatosEdicionGrupoClienteFormaPago.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGrupoClienteFormaPago!=null) {
				this.jTabbedPaneBusquedasGrupoClienteFormaPago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGrupoClienteFormaPago!=null) {
				this.jScrollPanelDatosGrupoClienteFormaPago.setVisible(true);
			}
			
			if(this.jPanelPaginacionGrupoClienteFormaPago!=null) {
				this.jPanelPaginacionGrupoClienteFormaPago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGrupoClienteFormaPago!=null) {
				this.jPanelParametrosReportesGrupoClienteFormaPago.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionGrupoClienteFormaPago!=null) {
				this.jScrollPanelDatosEdicionGrupoClienteFormaPago.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGrupoClienteFormaPago!=null) {
				this.jTabbedPaneBusquedasGrupoClienteFormaPago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGrupoClienteFormaPago!=null) {
				this.jScrollPanelDatosGrupoClienteFormaPago.setVisible(true);
			}
			
			if(this.jPanelPaginacionGrupoClienteFormaPago!=null) {
				this.jPanelPaginacionGrupoClienteFormaPago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGrupoClienteFormaPago!=null) {
				this.jPanelParametrosReportesGrupoClienteFormaPago.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasGrupoClienteFormaPago!=null) {
					this.jTabbedPaneBusquedasGrupoClienteFormaPago.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesGrupoClienteFormaPago!=null) {
				this.jPanelParametrosReportesGrupoClienteFormaPago.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGrupoClienteFormaPago!=null) {
				this.jTabbedPaneBusquedasGrupoClienteFormaPago.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesGrupoClienteFormaPago!=null) {
				this.jPanelParametrosReportesGrupoClienteFormaPago.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdGrupoCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdGrupoCliente) {this.jTabbedPaneBusquedasGrupoClienteFormaPago.remove(jPanelFK_IdGrupoClienteGrupoClienteFormaPago);}

			this.isVisibilidadFK_IdTipoFormaPago=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasGrupoClienteFormaPago.remove(jPanelFK_IdTipoFormaPagoGrupoClienteFormaPago);}
		}
		
	}

	public void setVisibilidadBusquedasParaGrupoCliente(Boolean isParaGrupoCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaGrupoClienteNegation=!isParaGrupoCliente;

			this.isVisibilidadFK_IdGrupoCliente=isParaGrupoCliente;
			if(!this.isVisibilidadFK_IdGrupoCliente) {this.jTabbedPaneBusquedasGrupoClienteFormaPago.remove(jPanelFK_IdGrupoClienteGrupoClienteFormaPago);}

			this.isVisibilidadFK_IdTipoFormaPago=isParaGrupoClienteNegation;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasGrupoClienteFormaPago.remove(jPanelFK_IdTipoFormaPagoGrupoClienteFormaPago);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoFormaPago(Boolean isParaTipoFormaPago){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoFormaPagoNegation=!isParaTipoFormaPago;

			this.isVisibilidadFK_IdGrupoCliente=isParaTipoFormaPagoNegation;
			if(!this.isVisibilidadFK_IdGrupoCliente) {this.jTabbedPaneBusquedasGrupoClienteFormaPago.remove(jPanelFK_IdGrupoClienteGrupoClienteFormaPago);}

			this.isVisibilidadFK_IdTipoFormaPago=isParaTipoFormaPago;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasGrupoClienteFormaPago.remove(jPanelFK_IdTipoFormaPagoGrupoClienteFormaPago);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//GrupoClienteFormaPagoSessionBean grupoclienteformapagoSessionBean=new GrupoClienteFormaPagoSessionBean();
		
		if(this.grupoclienteformapagoSessionBean==null) {
			this.grupoclienteformapagoSessionBean=new GrupoClienteFormaPagoSessionBean();
		}
		
		this.grupoclienteformapagoSessionBean.setsUltimaBusquedaGrupoClienteFormaPago(this.getsAccionBusqueda());
		this.grupoclienteformapagoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.grupoclienteformapagoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			grupoclienteformapagoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdGrupoCliente")) {
			grupoclienteformapagoSessionBean.setid_grupo_cliente(this.getid_grupo_clienteFK_IdGrupoCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoFormaPago")) {
			grupoclienteformapagoSessionBean.setid_tipo_forma_pago(this.getid_tipo_forma_pagoFK_IdTipoFormaPago());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//GrupoClienteFormaPagoSessionBean grupoclienteformapagoSessionBean=new GrupoClienteFormaPagoSessionBean();
		
		if(this.grupoclienteformapagoSessionBean==null) {
			this.grupoclienteformapagoSessionBean=new GrupoClienteFormaPagoSessionBean();
		}
		
		if(this.grupoclienteformapagoSessionBean.getsUltimaBusquedaGrupoClienteFormaPago()!=null&&!this.grupoclienteformapagoSessionBean.getsUltimaBusquedaGrupoClienteFormaPago().equals("")) {
			this.setsAccionBusqueda(grupoclienteformapagoSessionBean.getsUltimaBusquedaGrupoClienteFormaPago());
			this.setiNumeroPaginacion(grupoclienteformapagoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(grupoclienteformapagoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(grupoclienteformapagoSessionBean.getid_empresa());
				grupoclienteformapagoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdGrupoCliente")) {
				this.setid_grupo_clienteFK_IdGrupoCliente(grupoclienteformapagoSessionBean.getid_grupo_cliente());
				grupoclienteformapagoSessionBean.setid_grupo_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoFormaPago")) {
				this.setid_tipo_forma_pagoFK_IdTipoFormaPago(grupoclienteformapagoSessionBean.getid_tipo_forma_pago());
				grupoclienteformapagoSessionBean.setid_tipo_forma_pago(-1L);
			}
		}
		
		this.grupoclienteformapagoSessionBean.setsUltimaBusquedaGrupoClienteFormaPago("");
		this.grupoclienteformapagoSessionBean.setiNumeroPaginacion(GrupoClienteFormaPagoConstantesFunciones.INUMEROPAGINACION);
		this.grupoclienteformapagoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaGrupoClienteFormaPago(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioGrupoClienteFormaPago() {
		this.updateBorderResaltarBusquedasFormularioGrupoClienteFormaPago();
		this.updateVisibilidadBusquedasFormularioGrupoClienteFormaPago();
		this.updateHabilitarBusquedasFormularioGrupoClienteFormaPago();
	}
	
	public void updateBorderResaltarBusquedasFormularioGrupoClienteFormaPago() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasGrupoClienteFormaPago.getComponents().length>0) {
	

		if(this.grupoclienteformapagoConstantesFunciones.resaltarFK_IdGrupoClienteGrupoClienteFormaPago!=null) {
			index= this.jTabbedPaneBusquedasGrupoClienteFormaPago.indexOfComponent(this.jPanelFK_IdGrupoClienteGrupoClienteFormaPago);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasGrupoClienteFormaPago.getComponent(index);
				jPanel.setBorder(this.grupoclienteformapagoConstantesFunciones.resaltarFK_IdGrupoClienteGrupoClienteFormaPago);
			}
		}

		if(this.grupoclienteformapagoConstantesFunciones.resaltarFK_IdTipoFormaPagoGrupoClienteFormaPago!=null) {
			index= this.jTabbedPaneBusquedasGrupoClienteFormaPago.indexOfComponent(this.jPanelFK_IdTipoFormaPagoGrupoClienteFormaPago);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasGrupoClienteFormaPago.getComponent(index);
				jPanel.setBorder(this.grupoclienteformapagoConstantesFunciones.resaltarFK_IdTipoFormaPagoGrupoClienteFormaPago);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioGrupoClienteFormaPago() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasGrupoClienteFormaPago.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasGrupoClienteFormaPago.indexOfComponent(this.jPanelFK_IdGrupoClienteGrupoClienteFormaPago);
			jPanel=(JPanel)this.jTabbedPaneBusquedasGrupoClienteFormaPago.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.grupoclienteformapagoConstantesFunciones.mostrarFK_IdGrupoClienteGrupoClienteFormaPago);
			if(!this.grupoclienteformapagoConstantesFunciones.mostrarFK_IdGrupoClienteGrupoClienteFormaPago && index>-1) {
				this.jTabbedPaneBusquedasGrupoClienteFormaPago.remove(index);
			}

			index= this.jTabbedPaneBusquedasGrupoClienteFormaPago.indexOfComponent(this.jPanelFK_IdTipoFormaPagoGrupoClienteFormaPago);
			jPanel=(JPanel)this.jTabbedPaneBusquedasGrupoClienteFormaPago.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.grupoclienteformapagoConstantesFunciones.mostrarFK_IdTipoFormaPagoGrupoClienteFormaPago);
			if(!this.grupoclienteformapagoConstantesFunciones.mostrarFK_IdTipoFormaPagoGrupoClienteFormaPago && index>-1) {
				this.jTabbedPaneBusquedasGrupoClienteFormaPago.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioGrupoClienteFormaPago() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasGrupoClienteFormaPago.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasGrupoClienteFormaPago.indexOfComponent(this.jPanelFK_IdGrupoClienteGrupoClienteFormaPago);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasGrupoClienteFormaPago.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.grupoclienteformapagoConstantesFunciones.activarFK_IdGrupoClienteGrupoClienteFormaPago);
				this.jTabbedPaneBusquedasGrupoClienteFormaPago.setEnabledAt(index,this.grupoclienteformapagoConstantesFunciones.activarFK_IdGrupoClienteGrupoClienteFormaPago);
			}

			index= this.jTabbedPaneBusquedasGrupoClienteFormaPago.indexOfComponent(this.jPanelFK_IdTipoFormaPagoGrupoClienteFormaPago);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasGrupoClienteFormaPago.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.grupoclienteformapagoConstantesFunciones.activarFK_IdTipoFormaPagoGrupoClienteFormaPago);
				this.jTabbedPaneBusquedasGrupoClienteFormaPago.setEnabledAt(index,this.grupoclienteformapagoConstantesFunciones.activarFK_IdTipoFormaPagoGrupoClienteFormaPago);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaGrupoClienteFormaPago(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdGrupoCliente")) {
			index= this.jTabbedPaneBusquedasGrupoClienteFormaPago.indexOfComponent(this.jPanelFK_IdGrupoClienteGrupoClienteFormaPago);

			this.jTabbedPaneBusquedasGrupoClienteFormaPago.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasGrupoClienteFormaPago.getComponent(index);

			this.grupoclienteformapagoConstantesFunciones.setResaltarFK_IdGrupoClienteGrupoClienteFormaPago(resaltar);

			jPanel.setBorder(this.grupoclienteformapagoConstantesFunciones.resaltarFK_IdGrupoClienteGrupoClienteFormaPago);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoFormaPago")) {
			index= this.jTabbedPaneBusquedasGrupoClienteFormaPago.indexOfComponent(this.jPanelFK_IdTipoFormaPagoGrupoClienteFormaPago);

			this.jTabbedPaneBusquedasGrupoClienteFormaPago.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasGrupoClienteFormaPago.getComponent(index);

			this.grupoclienteformapagoConstantesFunciones.setResaltarFK_IdTipoFormaPagoGrupoClienteFormaPago(resaltar);

			jPanel.setBorder(this.grupoclienteformapagoConstantesFunciones.resaltarFK_IdTipoFormaPagoGrupoClienteFormaPago);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarGrupoClienteFormaPago.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioGrupoClienteFormaPago() throws Exception {

		if(this.jInternalFrameDetalleFormGrupoClienteFormaPago==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioGrupoClienteFormaPago();
		this.updateVisibilidadResaltarControlesFormularioGrupoClienteFormaPago();
		this.updateHabilitarResaltarControlesFormularioGrupoClienteFormaPago();
		
	}
	
	public void updateBorderResaltarControlesFormularioGrupoClienteFormaPago() throws Exception {
		if(this.jInternalFrameDetalleFormGrupoClienteFormaPago==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.grupoclienteformapagoConstantesFunciones.resaltaridGrupoClienteFormaPago!=null && this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) {this.jInternalFrameDetalleFormGrupoClienteFormaPago.jLabelidGrupoClienteFormaPago.setBorder(this.grupoclienteformapagoConstantesFunciones.resaltaridGrupoClienteFormaPago);}
		if(this.grupoclienteformapagoConstantesFunciones.resaltarid_empresaGrupoClienteFormaPago!=null && this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) {this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_empresaGrupoClienteFormaPago.setBorder(this.grupoclienteformapagoConstantesFunciones.resaltarid_empresaGrupoClienteFormaPago);}
		if(this.grupoclienteformapagoConstantesFunciones.resaltarid_grupo_clienteGrupoClienteFormaPago!=null && this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) {this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_grupo_clienteGrupoClienteFormaPago.setBorder(this.grupoclienteformapagoConstantesFunciones.resaltarid_grupo_clienteGrupoClienteFormaPago);}
		if(this.grupoclienteformapagoConstantesFunciones.resaltarid_tipo_forma_pagoGrupoClienteFormaPago!=null && this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) {this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_tipo_forma_pagoGrupoClienteFormaPago.setBorder(this.grupoclienteformapagoConstantesFunciones.resaltarid_tipo_forma_pagoGrupoClienteFormaPago);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioGrupoClienteFormaPago() throws Exception {		
		if(this.jInternalFrameDetalleFormGrupoClienteFormaPago==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) {
	
		//this.jInternalFrameDetalleFormGrupoClienteFormaPago.jLabelidGrupoClienteFormaPago.setVisible(this.grupoclienteformapagoConstantesFunciones.mostraridGrupoClienteFormaPago);
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jPanelidGrupoClienteFormaPago.setVisible(this.grupoclienteformapagoConstantesFunciones.mostraridGrupoClienteFormaPago);
		//this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_empresaGrupoClienteFormaPago.setVisible(this.grupoclienteformapagoConstantesFunciones.mostrarid_empresaGrupoClienteFormaPago);
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jPanelid_empresaGrupoClienteFormaPago.setVisible(this.grupoclienteformapagoConstantesFunciones.mostrarid_empresaGrupoClienteFormaPago);
		//this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_grupo_clienteGrupoClienteFormaPago.setVisible(this.grupoclienteformapagoConstantesFunciones.mostrarid_grupo_clienteGrupoClienteFormaPago);
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jPanelid_grupo_clienteGrupoClienteFormaPago.setVisible(this.grupoclienteformapagoConstantesFunciones.mostrarid_grupo_clienteGrupoClienteFormaPago);
		//this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_tipo_forma_pagoGrupoClienteFormaPago.setVisible(this.grupoclienteformapagoConstantesFunciones.mostrarid_tipo_forma_pagoGrupoClienteFormaPago);
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jPanelid_tipo_forma_pagoGrupoClienteFormaPago.setVisible(this.grupoclienteformapagoConstantesFunciones.mostrarid_tipo_forma_pagoGrupoClienteFormaPago);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioGrupoClienteFormaPago() throws Exception {
		if(this.jInternalFrameDetalleFormGrupoClienteFormaPago==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormGrupoClienteFormaPago!=null) {
	
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jLabelidGrupoClienteFormaPago.setEnabled(this.grupoclienteformapagoConstantesFunciones.activaridGrupoClienteFormaPago);
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_empresaGrupoClienteFormaPago.setEnabled(this.grupoclienteformapagoConstantesFunciones.activarid_empresaGrupoClienteFormaPago);
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_grupo_clienteGrupoClienteFormaPago.setEnabled(this.grupoclienteformapagoConstantesFunciones.activarid_grupo_clienteGrupoClienteFormaPago);
		this.jInternalFrameDetalleFormGrupoClienteFormaPago.jComboBoxid_tipo_forma_pagoGrupoClienteFormaPago.setEnabled(this.grupoclienteformapagoConstantesFunciones.activarid_tipo_forma_pagoGrupoClienteFormaPago);
		}
	}
	
		
}